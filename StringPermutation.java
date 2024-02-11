Input : Good
Output : Good ,Godo , Gdoo , dooG , doGo , dGoo , oGdo , oGod ….

import java.util.*;
public class Main {
    
    static void swap(int i, int j, char[] ch){
        char t =ch[i];
        ch[i]=ch[j];
        ch[j]=t;
    }
    
    static void permute(int index, int n, char[] ch, ArrayList<String> ans){
        if(index == n){
            String str = String.valueOf(ch); // convert char array to string
            if (!ans.contains(str)) { 
                ans.add(str);
            }
            return;
        }
        for(int i=index; i<=n; i++){
            swap(i,  index, ch);
            permute(index+1, n, ch, ans);
            swap(i, index, ch);
        }
    }
    
    public ArrayList<String> find_permutation(String S) {
        ArrayList<String> ans = new ArrayList<>();
        char[] ch = new char[S.length()];
        for(int i=0; i<S.length(); i++){
            ch[i] = S.charAt(i);
        }
        permute(0 ,ch.length - 1, ch, ans);
        Collections.sort(ans);
        return ans;
    }
    
    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a string:");
        String input = scanner.nextLine();
        
        ArrayList<String> permutations = main.find_permutation(input);
        System.out.println("Permutations of '" + input + "': ");
        for (String perm : permutations) {
            System.out.println(perm);
        }
        
        scanner.close(); 
    }
}
