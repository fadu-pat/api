package com.fadu.serverapi.api.service;

import java.util.HashMap;
import java.util.List;

import com.fadu.serverapi.api.vo.EquipApiVO;

public interface EquipApiService {

	public List<HashMap<String, Object>> selectEquipApiList(EquipApiVO equipApiVO)throws Exception;
	
	public void insertEquipApi(EquipApiVO equipApiVO)throws Exception;
	
	public void updateEquipApi(EquipApiVO equipApiVO)throws Exception;
	
	public void deleteEquipApi(EquipApiVO equipApiVO)throws Exception;
	
	public List<EquipApiVO> selectEquipList(EquipApiVO equipApiVO)throws Exception;
	
	public int selectEquipListCnt(EquipApiVO equipApiVO)throws Exception;
	
}
