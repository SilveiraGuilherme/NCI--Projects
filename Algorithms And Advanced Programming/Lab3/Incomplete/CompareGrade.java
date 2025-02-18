import javax.swing.JOptionPane;

public class CompareGrade {
    public static void main(String[] args) {
        // variables
        int n; // number of grades the user wants to input
        int sort = 1; // 1 sorts alphabetically, 2 sorts numerically

        n = Integer.parseInt(JOptionPane.showInputDialog("How many subjects do you want to add?"));
        Grade[] grades = new Grade[n];

        for (int i = 0; i < grades.length; i++) {
            Grade gr = new Grade();
            gr.setSubName(JOptionPane
                    .showInputDialog("Enter the name of the subject (" + (i + 1) + " / " + grades.length + ")"));
            gr.setSubGrade(Integer.parseInt(JOptionPane
                    .showInputDialog("Enter your grade for this subject (" + (i + 1) + " / " + grades.length + ")")));
            grades[i] = new Grade(gr.getSubName(), gr.getSubGrade());
        }

        JOptionPane.showMessageDialog(null, grades);

        sort = Integer.parseInt(
        JOptionPane.showInputDialog("How do you want to sort it? (1: Alphabetically, 2: Numerically)"));

        //Incomplete
        ComparisonSortFunctions compare = new ComparisonSortFunctions();

        
}
