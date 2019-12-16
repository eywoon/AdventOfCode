import java.util.HashMap;
import java.util.Map;

public class Dec2 {


    enum opcodeType{
       ONE, TWO, NINTYNINE
    }
    //process opcode (4 positions)

    //opcode1 calculation -> add and overwrite
    public static Map<Integer, Integer>  opcode1(int value1Index, int value2Index, int overwriteIndex, Map<Integer, Integer> program){

        int val1 = program.get(value1Index);
        int val2 = program.get(value2Index);

        program.put(overwriteIndex, val1+val2);

        return program;
    }

    //opcode2 calculation -> multiply and overwrite
    public static Map<Integer, Integer>  opcode2(int value1Index, int value2Index, int overwriteIndex,  Map<Integer, Integer> program){
        int val1 = program.get(value1Index);
        int val2 = program.get(value2Index);

        program.put(overwriteIndex, val1*val2);

        return program;
    }

    public void whatOpcode(opcodeType opcode){
        switch(opcode) {
            case ONE:
                System.out.println("addition");
                break;
            case TWO:
                System.out.println("multiplycation");
                break;
            case NINTYNINE:
                System.out.println("end program");
                break;
        }
    }

    public static void main(String[] args){

        int[] a = {1,9,10,3,2,3,11,0,99,30,40,50};
        HashMap<Integer, Integer> testProgram = new HashMap<Integer, Integer>();

        for(int i = 0; i < a.length; i++){
            testProgram.put(i, a[i]);
        }

        Map<Integer, Integer> program = ParseInput.parseTxtLineWithDelimeter("/Users/Eyrun/Dev/src/main/resources/dec2input.txt");
        //
        opcode1(0,1,3, testProgram);

        System.out.println(testProgram.get(3));

    }
}
