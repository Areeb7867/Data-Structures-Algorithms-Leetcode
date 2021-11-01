public int maximumWealth(int[][] accounts) {
        int ans = Integer.MIN_VALUE ;
        for (int person = 0; person < accounts.length; person++) { // person considered for row 
            int sum = 0 ;
            for (int account = 0; account < accounts[person].length; account++) { // account considered for columns
                sum += accounts[person][account];
            }
            if(sum>ans){ // comparing sum of account from every row
                ans = sum ;
            }
            
        }
        System.out.println(ans);
        return ans ;
    }
