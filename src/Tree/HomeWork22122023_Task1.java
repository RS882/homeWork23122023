package Tree;

public class HomeWork22122023_Task1 {
    public static void main(String[] args) {

        int[][][]arr = new int[][][]{
                {
                        {0,-2,},{3,4},{8,5,-6,7,8},{1,4,-6,7,8,9}
                },
                {
                        {1,2,4,-2,},{3},{1,5,6,7,8,-4,6,7,8,9}
                },
                {
                        {5,-6,7,8}
                },
                {
                        {1,-2,},{3,4},{55,-5,6,7,8},{},{6,7,8,9}
                },
                {
                        {44,22,-1,2,},{3,4},{-3},{1,-4},{6,7},{1,2,1,8,9}
                }

        };

        System.out.println(sumOfArr(arr));

        System.out.println(sumOfArr(new int[]{1,2,3}));
    }

    public static int sumOfArr(Object arr){
        if( arr instanceof int[] ){
            int res = 0;
            for (int el:(int[]) arr) {
                res+=el;
            }
        return res;
        }else{
            int res1 = 0;
            for (Object elem: (Object[]) arr) {
                res1+= sumOfArr(elem);
            }
            return res1;
        }



    }
}
//    Напишите метод, который получает в качестве аргумента многомерный
//    чисел и возвращает сумму всех чисел