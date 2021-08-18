package com.example.demo.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Medicine;

@Repository
public class MedicineDaoImpl implements MedicineDao {
	
	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public String mAdd(Medicine medi) {
		String status="";
		Medicine midi=mSearch(medi.getmID());
		return status;
	}

	@Override
	public String mDelete(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Medicine mSearch(int mid) {
		Medicine md;
		List<Medicine> medList=jdbcTemplate.query("select * from MedicineRecord where ID='"+mid+"'", (rs,rowCount)->{
			
			Medicine m=new Medicine();
			m.setmID(Integer.parseInt(rs.getString("ID")));
			m.setmName(rs.getString("NAME"));
			m.setmCount(Integer.parseInt(rs.getString("COUNT")));
			m.setmDescription(rs.getString("DESCRIPTION"));
			
			
			
			return m;
			
		});
		if(medList.isEmpty()==true) {
			
			md=null;
		}
		else {
			return md=medList.get(0);
		}
		
	
	}

	

}
