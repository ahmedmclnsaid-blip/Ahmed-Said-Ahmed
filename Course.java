public static void main() {
    public class Course {
        private String courseName;
        private String[] students = new String[4];
        private int numberOfStudents = 0;

        public Course(String courseName) {
            this.courseName = courseName;
        }

        public String getCourseName() {
            return courseName;
        }
        public void addStudent(String student) {
            if (numberOfStudents == students.length) {
                String[] larger = new String[students.length * 2];
                for (int i = 0; i < numberOfStudents; i++) {
                    larger[i] = students[i];
                }
                students = larger;
            }
            students[numberOfStudents++] = student;
        }
        public void dropStudent(String student) {
            for (int i = 0; i < numberOfStudents; i++) {
                if (students[i].equals(student)) {
                    for (int j = i; j < numberOfStudents - 1; j++) {
                        students[j] = students[j + 1];
                    }
                    students[--numberOfStudents] = null;
                    return; // drops first match only
                }
            }
        }
        public String[] getStudents() {
            String[] result = new String[numberOfStudents];
            for (int i = 0; i < numberOfStudents; i++) {
                result[i] = students[i];
            }
            return result;
        }
        public int getNumberOfStudents() {
            return numberOfStudents;
        }
    }

}
