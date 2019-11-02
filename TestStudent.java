public class TestStudent{
   public static void main (String [] args){
       Student stu1 = new Student();
       Student stu2 = new Student();
       Student stu3 = new Student();
       double avg;
       //stu1 setter
       stu1.setName("Cheung Siu Ming");
       stu1.setId(310567);
       stu1.setScore(87.1);
       //stu2 setter
       stu2.setName("Ng Wai Man");
       stu2.setId(451267);
       stu2.setScore(77.5);
       //stu3 setter
       stu3.setName("Wong Sui Kai");
       stu3.setId(789014);
       stu3.setScore(83.4);
       //print 3 students info
       System.out.println("Student 1: name="+stu1.getName()+" id="
                         +stu1.getId()+" score="+stu1.getScore());
       System.out.println("Student 2: name="+stu2.getName()+" id="
                         +stu2.getId()+" score="+stu2.getScore());
       System.out.println("Student 3: name="+stu3.getName()+" id="
                         +stu3.getId()+" score="+stu3.getScore());
       //print one more line 
       System.out.println();
       //avgerage calculation
       avg = (stu1.getScore() + stu2.getScore() + stu3.getScore())/3;
       //print avg score
       System.out.println("Average Score = "+avg);                    
   }
}
