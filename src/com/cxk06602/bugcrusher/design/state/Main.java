package com.cxk06602.bugcrusher.design.state;

public class Main {
    static void main() throws InterruptedException{
        AllStateContent allStateContent = new AllStateContent(new WaitSellerState());
        allStateContent.action();

        for (int i = 0; i < 100000; i++) {
            if(
                    !switch ((int)(Math.random() * 5)){
                        case 0 -> allStateContent.getState().nextWaitSellerState(allStateContent);
                        case 1 -> allStateContent.getState().nextGetItemState(allStateContent);
                        case 2 -> allStateContent.getState().nextTransportState(allStateContent);
                        case 3 -> allStateContent.getState().nextWaitBuyerFinishingState(allStateContent);
                        case 4 -> allStateContent.getState().nextFinishState(allStateContent);
                        default -> throw new IllegalStateException("Unexpected value: " + (int)(Math.random() * 5));
                    }
            ) {
                System.out.println("等待请求");
                Thread.sleep(1000);
                System.out.println("获得请求");
                continue;
            }
            allStateContent.action();
            if(allStateContent.getState() instanceof FinishState){
                System.out.println("程序结束");
                break;
            }
        }
    }
}
