import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionListener; 

public class Exp1 extends Frame
implements ActionListener  {

  
     
    String studentName, finalGrade;
    int studentAge,hindiMarks,engMarks,mathMarks,totalMarks;
    double percen,f;
    

    JFrame frame;
    JLabel details,name,age,Marks,Hindi,English,Math,result,total,percentage,grade;
   
    JTextField nameField
    , ageField
    ,hindiField
    ,englishField
    ,mathField
    ,totalField
    ,percenField
    ,gradeField;
    JButton submit;


   

    public Exp1(){

     

      frame = new JFrame();
      frame.setTitle("Student Report Card");
      frame.setSize(700,800);
      
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setLayout(null);
      details = new JLabel("Student Detials");
      
      details.setBounds(350, 20, 200, 40);
        frame.add(details);
        
      name = new JLabel("Name");
      
      name.setBounds(50, 100, 100, 40);
      frame.add(name);
        
      age = new JLabel("Age");
      
      age.setBounds(50, 150, 100, 40);
      frame.add(age);

      Marks = new JLabel("Marks Obtained");
        
        Marks.setBounds(350, 200, 200, 40);
        frame.add(Marks);
       
      Hindi = new JLabel("Hindi");
      Hindi.setBounds(50, 250, 100, 40);
        frame.add(Hindi);

      English = new JLabel("English");
        English.setBounds(50, 300, 100, 40);
        frame.add(English);

      Math = new JLabel("Math");
        Math.setBounds(50, 350, 100, 40);
        frame.add(Math);
        
      result = new JLabel("Result");
        result.setBounds(350, 380, 100, 40);
        frame.add(result);

      total = new JLabel("Total");
        total.setBounds(50,440,100,40);
        frame.add(total);

      percentage = new JLabel("Pecentage");
        percentage.setBounds(50,490,100,40);
        frame.add(percentage);

      grade = new JLabel("Result");
        grade.setBounds(50,550,100,40);
        frame.add(grade);

       
      nameField = new JTextField();
      nameField.setVisible(true);
        nameField.setBounds(110, 100, 200, 40); 
        frame.add(nameField);

      ageField = new JTextField();
        ageField.setBounds(110, 150, 200, 40); 
        frame.add(ageField);
        ageField.setVisible(true);

      hindiField = new JTextField();
        hindiField.setBounds(110, 250, 200, 40); 
        hindiField.setVisible(true);
        frame.add(hindiField);

      englishField = new JTextField();
        englishField.setBounds(110, 300, 200, 40); 
        englishField.setVisible(true);
        frame.add(englishField);

      mathField = new JTextField();
        mathField.setBounds(110, 350, 200, 40);
        mathField.setVisible(true); 
        frame.add(mathField);

        totalField = new JTextField();
        totalField.setBounds(110, 440, 200, 40); 
        frame.add(totalField);
        totalField.setVisible(true);

        percenField = new JTextField();
        percenField.setBounds(110, 490, 200, 40); 
        frame.add(percenField);
        percenField.setVisible(true);

        gradeField = new JTextField();
        gradeField.setBounds(110, 550, 200, 40); 
        gradeField.setVisible(true);
        frame.add(gradeField);

        submit = new JButton("Submit");
      submit.setBounds(400,700,100,40);
      submit.setVisible(true);
        frame.add(submit);
        frame.setVisible(true);
       submit.addActionListener(this);
    }
  


    public static void main(String[] args) {
       Exp1 obj = new Exp1();
       System.out.print(obj.studentAge);
    }
    public void actionPerformed(ActionEvent a){
           if(a.getSource()==submit)
           {
            studentName = nameField.getText();
            studentAge = Integer.parseInt(ageField.getText());
            hindiMarks = Integer.parseInt(hindiField.getText());
            engMarks = Integer.parseInt(englishField.getText());
            mathMarks = Integer.parseInt(mathField.getText());
            totalMarks = hindiMarks+engMarks+mathMarks;
             f = totalMarks;
            percen = (f/300)*100;
            String str2 = String.format("%.2f",percen);
            if(percen>40)
            {
              finalGrade = "PASS";
            }
            else
            {
              finalGrade = "FAIL";
            }
            totalField.setText(Integer.toString(totalMarks));
             percenField.setText(str2);
            gradeField.setText(finalGrade);
            System.out.print(studentAge);
           }
          
    }
     
     
}  

