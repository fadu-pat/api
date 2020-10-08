package com.fadu.serverapi.api.service.impl;

import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.fadu.serverapi.api.vo.EquipApiVO;


@Repository("equipApiMapper")
public interface EquipApiMapper {

	public List<HashMap<String, Object>> selectEquipApiList(EquipApiVO equipApiVO) throws Exception;
	
	public void insertEquipApi(EquipApiVO equipApiVO)throws Exception;
	
	public void updateEquipApi(EquipApiVO equipApiVO)throws Exception;
	
	public void deleteEquipApi(EquipApiVO equipApiVO)throws Exception;

	public List<EquipApiVO> selectEquipList(EquipApiVO equipApiVO)throws Exception;
	
	public int selectEquipListCnt(EquipApiVO equipApiVO)throws Exception;
}
