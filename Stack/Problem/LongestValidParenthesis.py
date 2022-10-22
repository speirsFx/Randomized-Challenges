class LongestValidParenthesis:
    def substrings(self, s):
        res = []

        for i in range(0,len(s)):
            for j in range(i+1,len(s)+1):
                res.append(s[i:j])
        res = set(res)
        res = list(res)
        res.sort(key=len)
        return res


        def isValid(self, s):
        """
        :type s: str
        :rtype: bool
        """
            li = []
            for i in s:
                if i in ['[', '(', '{']:
                    li.append(i)
                if i in [']', ')', '}']:
                    if len(li) == 0:
                        return False
                    if abs(ord(i) - ord(li.pop())) > 2:
                        return False
        if len(li) > 0:
            return False
        return True

        #O(n) solution
        def longestValidParentheses(self, s):

            st = []
            st.append(-1)
            res = 0

            for i in range(0,len(s)):

                if s[i] == '(':
                st.append(i)
                else:
                    if len(st) != 0:
                        st.pop()

                    if len(st) != 0:
                            res = max(res, i - st[len(st) - 1])

                    else:
                        st.append(i)
            return res
