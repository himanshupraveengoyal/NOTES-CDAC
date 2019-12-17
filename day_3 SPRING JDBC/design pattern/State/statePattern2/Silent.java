package statePattern2;

class Silent implements MobileAlertState 
{ 
    @Override
    public void alert(AlertStateContext ctx)  
    { 
        System.out.println("silent..."); 
    } 
  
} 
