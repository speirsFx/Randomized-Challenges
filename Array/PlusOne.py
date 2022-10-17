class PlusOne(object):
    def plusOne(self, digits):
        """
        :type digits: List[int]
        :rtype: List[int]
        """
        sum = 0;
        l = len(digits)-1
        for i in digits:
            sum = sum + i*10**l
            l = l - 1
        sum = sum + 1
        res = [int(x) for x in str(sum)]
        return res
