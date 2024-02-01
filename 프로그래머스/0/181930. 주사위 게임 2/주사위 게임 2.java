class Solution {
    public int solution(int a, int b, int c) {
        
        int a2 = a*a;
        int b2 = b*b;
        int c2 = c*c;
        int a3 = a*a*a;
        int b3 = b*b*b;
        int c3 = c*c*c;
      
        if(a!=b && b!=c && a!=c) {
            return a + b + c;
        } else if  (a==b && a==c) {
            return (a + b + c) * (a2 + b2 + c2) * (a3 + b3 + c3);
        } else {
            return (a + b + c) * (a2 + b2 + c2);
        }
    }
}



// 세 숫자가 모두 다르다면 a + b + c 
// 두 숫자 같고, 하나가 다르면  (a + b + c) × (a2 + b2 + c2 ) 점을 얻음
// 세 숫자가 모두 같으면 (a + b + c) × (a2 + b2 + c2 ) × (a3 + b3 + c3 )점을 얻음