package com.device.mapper;

import java.util.List;

import com.device.model.GameRunRecord;

public interface GameRunRecordMapper {

	int deleteByPrimaryKey(Integer id);

	int insert(GameRunRecord record);

	int insertSelective(GameRunRecord record);

	GameRunRecord selectByPrimaryKey(Integer id);

	int updateByPrimaryKeySelective(GameRunRecord record);

	int updateByPrimaryKey(GameRunRecord record);
	
	List<GameRunRecord> findByNoSync();
	
	void batchDeleteHistory(List<GameRunRecord> gameRunRecords);
}