class Student extends Person{
	private int[] testScores=new int[100];
    int sum=0,size;
    double avg;

    Student(String firstName,String lastName,int id,int[] testScores){
        
        super(firstName,lastName,id);
       size=testScores.length;
        for(int i=0;i<size;i++)
           this.testScores[i]=testScores[i];
  }

    char calculate(){
        for(int i=0;i<testScores.length;i++){
            sum=sum+testScores[i];
        }
        
        avg=sum/size;
     
        if(avg>=90 && avg<=100)
            return 'O';
        else if(avg>=80 && avg<90)
            return 'E';
            else if(avg>=70 && avg<80)
                return 'A';
                else if(avg>=55 && avg<70)
                    return 'P';
                    else if(avg>=40 && avg<55)
                        return 'D';
                        else 
                            return 'T';
        
    }
}