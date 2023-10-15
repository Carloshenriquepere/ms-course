package com.devsuperior.hreurekaserver.services;

import com.devsuperior.hreurekaserver.entities.Payment;
import com.devsuperior.hreurekaserver.entities.Worker;
import com.devsuperior.hreurekaserver.feignclients.WorkerFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    @Autowired
    private WorkerFeignClient workerFeignClient;

    public Payment getPayment(long workerId, int days){

        Worker worker = workerFeignClient.findById(workerId).getBody();
        return new Payment(worker.getName(), worker.getDailyIncome(), days);
    }


}
