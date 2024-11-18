package com.IRCTC_ResourceApp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.IRCTC_ResourceApp.repository.PassangerRepository;
import com.IRCTC_ResourceApp.request.Passanger;
import com.IRCTC_ResourceApp.responce.Ticket;

@Service
public class ServiceImpl implements ServiceI {

	@Autowired
	private PassangerRepository passangerRepository;

	@Override
	public Ticket bookTicket(Passanger psg) {
		Passanger save = passangerRepository.save(psg);
		
		if(save !=null) {
			Ticket t = new Ticket();
			t.settPnr("1234");
			t.setTprice(2000.00);
			t.setTicketStatus("Booked");
			return t;
		}
		else {
			Ticket t = new Ticket();
			t.settPnr(null);
			t.setTprice(00.00);
			t.setTicketStatus("Not Booked");
			return t;
		}
		
	}
}
