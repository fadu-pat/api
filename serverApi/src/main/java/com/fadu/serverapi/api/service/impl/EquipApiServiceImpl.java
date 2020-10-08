package com.fadu.serverapi.api.service.impl;

import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.fadu.serverapi.api.service.EquipApiService;
import com.fadu.serverapi.api.vo.EquipApiVO;

@Service("equipApiService")
public class EquipApiServiceImpl implements EquipApiService {

	@Resource(name = "equipApiMapper")
	private EquipApiMapper equipApiDAO;

	/**
	 * 서버 리스트 조회
	 */
	@Override
	public List<HashMap<String, Object>> selectEquipApiList(EquipApiVO equipApiVO) throws Exception {

		return equipApiDAO.selectEquipApiList(equipApiVO);
	}

	@Override
	public void insertEquipApi(EquipApiVO equipApiVO) throws Exception {
		equipApiDAO.insertEquipApi(equipApiVO);

	}

	@Override
	public void updateEquipApi(EquipApiVO equipApiVO) throws Exception {
		equipApiDAO.updateEquipApi(equipApiVO);

	}

	@Override
	public void deleteEquipApi(EquipApiVO equipApiVO) throws Exception {
		equipApiDAO.deleteEquipApi(equipApiVO);

	}

	@Override
	public List<EquipApiVO> selectEquipList(EquipApiVO equipApiVO) throws Exception {

		return equipApiDAO.selectEquipList(equipApiVO);
	}

	@Override
	public int selectEquipListCnt(EquipApiVO equipApiVO) throws Exception {
		return equipApiDAO.selectEquipListCnt(equipApiVO);
	}
	
	
	
	

}
