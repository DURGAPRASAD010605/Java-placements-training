class linked {
    public static void main(String x[]) {

        m travel;          // reference variable
        m k1 = new m();    // first node
        m n = new m();     // second node
        k1.f = 10;
        n.f = 20;
        k1.k = n;
        travel = k1.k;     
        System.out.println(n.f);
        System.out.println(travel.f);
    }
}

class m {
    int f;    
    m k;     
}