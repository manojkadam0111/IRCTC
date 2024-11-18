package com.IRCTC_ResourceApp.service;

import com.IRCTC_ResourceApp.request.Passanger;
import com.IRCTC_ResourceApp.responce.Ticket;

public interface ServiceI {

	public Ticket bookTicket(Passanger psg);
}
