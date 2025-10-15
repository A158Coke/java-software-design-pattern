package com.yuChen.design_pattern.patterns.responsiChain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Approver {
    protected Approver successor;
    protected String name;
    public abstract void processRequest(final PurchaseRequest request);
}

class DepartmentApprover extends Approver {
    public DepartmentApprover(String name) {
        super();
        this.name = name;
    }
    @Override
    public void processRequest(final PurchaseRequest request) {
        if (request.getPrice() < 5000) {
            System.out.println("ID ：" + request.getId() + " be " + this.name + " processed");
        } else {
            this.successor.processRequest( request);
        }
    }
}
