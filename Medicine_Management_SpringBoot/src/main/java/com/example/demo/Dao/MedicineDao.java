package com.example.demo.Dao;

import com.example.demo.entity.Medicine;

public interface MedicineDao {
	
	public String mAdd(Medicine medi);
	public String mDelete(int mid);
	public Medicine mSearch(int mid);

}
