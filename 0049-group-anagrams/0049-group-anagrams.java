class Solution {

    public boolean checkAnagram(String s1,String s2)
    {
        if(s1.length()!=s2.length())
        {
            return false;
        }

        int[] freq1=new int[26];
        int[] freq2=new int[26];

        for(int i=0;i<s1.length();i++)
        {
            char ch=s1.charAt(i);
            freq1[ch-'a']++;
        }

        for(int i=0;i<s2.length();i++)
        {
            char ch=s2.charAt(i);
            freq2[ch-'a']++;
        }

        for(int i=0;i<26;i++)
        {
            if(freq1[i]!=freq2[i])
            {
                return false;
            }
        }

        return true;

    }

    public List<List<String>> groupAnagrams(String[] strs) {
        
        List<List<String>> ans=new ArrayList<>();

        ArrayList<Integer> idx=new ArrayList<>();

        for(int i=0;i<strs.length;i++)
        {
            if(idx.contains(i))
            {
                continue;
            }
            else
            {
                List<String> li=new ArrayList<>();
                for(int j=i;j<strs.length;j++)
                {
                    if(checkAnagram(strs[i],strs[j]))
                    {
                        li.add(strs[j]);
                        idx.add(j);
                    }
                }

                ans.add(li);

            }

            
        }

        return ans;
    }
}