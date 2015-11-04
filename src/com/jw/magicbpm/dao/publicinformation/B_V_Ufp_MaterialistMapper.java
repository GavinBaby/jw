package com.jw.magicbpm.dao.publicinformation;

import com.jw.magicbpm.model.publicinformation.B_V_Ufp_Materialist;
import java.util.List;
import java.util.Map;


public interface B_V_Ufp_MaterialistMapper {
	List<B_V_Ufp_Materialist> selectByExample(Map<String, Object> map);
}