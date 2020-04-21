package com.mudule.mumzonemarketcal.component.po.market;

public class MarketTicketWithBLOBs extends MarketTicket {
    private String ticketDesc;

    private String useInstructions;

    public String getTicketDesc() {
        return ticketDesc;
    }

    public void setTicketDesc(String ticketDesc) {
        this.ticketDesc = ticketDesc;
    }

    public String getUseInstructions() {
        return useInstructions;
    }

    public void setUseInstructions(String useInstructions) {
        this.useInstructions = useInstructions;
    }
}