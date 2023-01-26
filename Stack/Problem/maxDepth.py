class maxDepth(object):   
   def maxDepth(self, s):
        """
        :type s: str
        :rtype: int
        """
        l = []
        max = 0

        for i in s:
            if i == '(':
                l.append(i)
            if len(l) > max:
                max = len(l)
            if i == ')':
                l.pop()
        return max

