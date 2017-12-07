package services;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;


import entities.Desastre;

public class DesastreService  implements IService<Desastre> {
private JdbcTemplate db;
	
	public DesastreService(DriverManagerDataSource dataSource) {
		db = new JdbcTemplate(dataSource);
	}
	@Override
		public List<Map<String, Object>> getList(String searchCriteria) {
			if (searchCriteria==null || searchCriteria.isEmpty()){
				return db.queryForList("select * from desastre order by distrito,fecha ");
			}else {
				return db.queryForList("select * from desastre where tipo like ?", '%' + searchCriteria + '%');
			}
		}
		

	@Override
	public List<Map<String, Object>> getList() {
		return db.queryForList("select * from desastre order by distrito,fecha ");
	}

	@Override
	public Desastre getById(int id) {
		Map<String, Object> object = db.queryForMap("select * from desastre where id=?", id);
		return new Desastre( (Integer) object.get("id"),
								 (Date) object.get("fecha"),
								  (String) object.get("tipo"),
								 (String) object.get("distrito"),
								 (Integer) object.get("numDam"));
	}
	


	@Override
	public void add(Desastre object) {
		db.update("insert into desastre(fecha,tipo,distrito,numDam)"
				+ " values (?,?,?,?)",
				object.getFecha(),object.getTipo(),object.getDistrito(),object.getNumDam());		
	}

	@Override
	public void update(Desastre object) {
		db.update("update desastre set fecha=?,tipo=?,distrito=?,numDam=? where id=?",
				object.getFecha(),object.getTipo(),object.getDistrito(),object.getNumDam(),object.getId());	
	}
	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}


 

}