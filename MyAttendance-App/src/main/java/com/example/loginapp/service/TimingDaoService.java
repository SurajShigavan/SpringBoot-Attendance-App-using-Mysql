package com.example.loginapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.loginapp.daorepo.TimingDao;
import com.example.loginapp.model.Timings;
import com.example.loginapp.model.UserMaster;

import jakarta.transaction.Transactional;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;


@Service
public class TimingDaoService {
	
	@Autowired
	TimingDao td;
	
//	public void updateSignoutime(int timingId, String newSignoutime) {
//		td.updateSignoutime1(newSignoutime, timingId);
//    }

	public void addsiginingtime(UserMaster um) {
		
		 LocalDate date = LocalDate.now();
		 LocalTime time = LocalTime.now();
		 
		 System.out.print(date);
		 System.out.print(time);
		 
		
		 Timings t = new Timings(); 
		 t.setUser(um);
		 t.setDate(date.toString());
		 t.setSigntime(time.toString());
		 
		 td.save(t);
		 
		 
	}

	@Transactional
	public void addsigouttime(UserMaster um) {
		// TODO Auto-generated method stub
		LocalDate date = LocalDate.now();
		 LocalTime time = LocalTime.now();
		 
		 
		 
//		 System.out.print(date);
//		 System.out.print(time);
//		 
//		 
//		 
////		 temp.setSingoutime(time.toString());
////		 
////		 td.deleteByPhoneno(um.getPhoneno());
//		 
//		 //td.updatebyid(time.toString(), um.getPhoneno());
//		 
//// 		 td.save(temp);
//		 Timings t1 = new Timings();
//		 //td.deleteAllByEmail(um.getEmail());
//		 t1.setUser(um);
//		 t1.setDate(date.toString());
//		 t1.setSingoutime(time.toString());
//		 
//		 td.save(t1);
		 
		 td.updatesignouttime(time.toString(),um.getUserid());
	}

//	public List<Timings> findbyuserid(int userid) {
//		// TODO Auto-generated method stub
//		return td.findAllTimingsByUserId(userid);
//	}
	public List<Timings> findbyuserid(Long userid) {
		// TODO Auto-generated method stub
		return td.findAllTimingsByUserId(userid);
	}
		
}
