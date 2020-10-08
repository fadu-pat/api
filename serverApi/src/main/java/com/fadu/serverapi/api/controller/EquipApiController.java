package com.fadu.serverapi.api.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.fadu.serverapi.api.service.EquipApiService;
import com.fadu.serverapi.api.vo.EquipApiVO;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

@Controller
@RestController
@EnableWebMvc
public class EquipApiController {

	private final static Logger LOGGER = LoggerFactory.getLogger(EquipApiController.class);

	@Resource(name = "equipApiService")
	private EquipApiService equipApiService;

	@RequestMapping(value = "/api/svlt", method = RequestMethod.GET)
	@ResponseBody
	public JSONArray equipApiList(EquipApiVO equipApiVO, HttpServletResponse res) throws Exception {

		List<HashMap<String, Object>> list = equipApiService.selectEquipApiList(equipApiVO);

		JSONArray j = JSONArray.fromObject(list);

		return j;
	}

	@RequestMapping(value = "/api/svlt", method = RequestMethod.POST)
	@ResponseBody
	public String equipApiInsert(@RequestBody EquipApiVO equipApiVO, HttpServletResponse res) throws Exception {
		LOGGER.debug("asd");
		try {
			equipApiService.insertEquipApi(equipApiVO);
		} catch (Exception e) {
			e.printStackTrace();
			e.getMessage();
			return "F";
		}

		return "S";
	}

	@RequestMapping(value = "/api/svlt", method = RequestMethod.DELETE)
	@ResponseBody
	public String equipApiDelete(EquipApiVO equipApiVO, HttpServletResponse res) throws Exception {

		// 유효성 검사
		if (equipApiVO.getId() != null && !"".equals(equipApiVO.getId())) {
			try {
				equipApiService.deleteEquipApi(equipApiVO);
			} catch (Exception e) {
				e.printStackTrace();
				return "E";
			}
			return "S";
		}

		return "F";
	}

	@RequestMapping(value = "/api/svlt", method = RequestMethod.PUT)
	@ResponseBody
	public String equipApiUpdate(@RequestBody EquipApiVO equipApiVO, HttpServletResponse res) throws Exception {

		// 유효성 검사
		if (equipApiVO.getId() != null && !"".equals(equipApiVO.getId())) {
			try {
				equipApiService.updateEquipApi(equipApiVO);
			} catch (Exception e) {
				e.printStackTrace();
				return "E";
			}
			return "S";
		}

		return "F";
	}

	// 화면용 리스트
	@RequestMapping(value = "/api/svlt/{id}", method = RequestMethod.GET)
	@ResponseBody
	public JSONObject equipList(EquipApiVO equipApiVO, @PathVariable("id") String id, HttpServletResponse res)
			throws Exception {

		Map<String, Object> map = new HashMap<String, Object>();

		// paging
		int pagingCnt = 10;

		map.put("paging", equipApiVO.getPaging());

		int totalCount = equipApiService.selectEquipListCnt(equipApiVO);

		int total = (int) Math.ceil((double) totalCount / pagingCnt);

		int start = 1;
		int end = 5;

		if (total < 5) {
			end = total;
		} else {
			if (equipApiVO.getPaging() > 3) {
				if (equipApiVO.getPaging() + 2 > total) {
					start = equipApiVO.getPaging() - 3;
					end = equipApiVO.getPaging() + 1;
				} else {
					start = equipApiVO.getPaging() - 2;
					end = equipApiVO.getPaging() + 2;
				}
				if (equipApiVO.getPaging() == total) {
					start = equipApiVO.getPaging() - 4;
					end = equipApiVO.getPaging();
				}
			}
		}

		map.put("totalCnt", total);
		map.put("startPage", start);
		map.put("endPage", end);

		// data
		int p = (equipApiVO.getPaging() - 1) * pagingCnt;

		equipApiVO.setPaging(p);
		equipApiVO.setSetPaging(pagingCnt);

		List<EquipApiVO> list = equipApiService.selectEquipList(equipApiVO);

		JSONArray j = JSONArray.fromObject(list);

		map.put("data", j);

		JSONObject a = JSONObject.fromObject(map);

		return a;
	}

}
