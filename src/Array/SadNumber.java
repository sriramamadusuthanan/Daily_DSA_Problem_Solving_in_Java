package Array;

public class SadNumber {
    public static void main(String[] args) {
        System.out.println(sadNumber(13));
    }

    //find next sad number
//    public static int sadNumber(int num)
//    {
//        int n=num+1;
//        ArrayList<Integer> list = new ArrayList<>();
//        list.add(n);
//        while(true) {
//            int temp = 0;
//            int org=n;
//            while (org > 0) {
//                int digit = org % 10;
//                temp = temp + digit + digit;
//                org = org / 10;
//            }
//
//            if (temp == 1) {
//                list.remove(n);
//                list.add(n + 1);
//                n = n + 1;
//            }else {
//                if (list.contains(temp)) {
//                    return temp;
//                }
//            }
//            list.add(temp);
//            n=n+1;
//
//        }

        public static int sadNumber(int num)
        {

            if(num+1<=9)
            {
                return num+1;
            }

            int n=num+1;

//            ArrayList<Integer> list = new ArrayList<>();
//            list.add(n);
            int org=n;
            while(true) {
                int temp = 0;

                while (org > 0) {
                    int digit = org % 10;
                    temp = temp + digit * digit;
                    org = org / 10;
                }

                if (temp == 1) {

                  return n;
                }else {
                    if(temp<10)
                    {
                        n=n+1;
                        org=n;
                    }else {
                        org=temp;
                    }

                }



            }


    }
}
