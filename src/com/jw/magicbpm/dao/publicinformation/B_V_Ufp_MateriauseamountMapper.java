package com.jw.magicbpm.dao.publicinformation;

import com.jw.magicbpm.model.publicinformation.B_V_Ufp_Materiauseamount;
import java.util.List;
import java.util.Map;

public interface B_V_Ufp_MateriauseamountMapper {
	List<B_V_Ufp_Materiauseamount> selectByExample(Map<String, Object> map);
}