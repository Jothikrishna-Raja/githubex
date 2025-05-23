      if(a.length()==1&&a.charAt(0)=='0' && b.length()==1&&b.charAt(0)=='0')
       return 1;
       if(a.length()==1 && a.charAt(0)=='0')
       return 0;
       if(b.length()==1&& b.charAt(0)=='0')
       return 1;
       int numa=a.charAt(a.length()-1)-'0';
       int numb=0;
       
       for(int i=0;i<b.length();i++){
           numb=numb*10+(b.charAt(i)-'0');
           numb%=4;
       }
           if(numb==0){
               numb=4;
           }
           
           
        int res=(int)Math.pow(numa,numb);//this is result.
           return res%10;
       
