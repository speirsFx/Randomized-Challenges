class ParenthesisMatching(object):
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
