class SimplifyPath(object):
    def simplifyPath(self, path):
        """
        :type path: str
        :rtype: str
        """
        li = path.split('/')
        li1= []
        st = []
        for i in li:
            if i == "":
                continue
            else:
                li1.append(i)
        print("li" ,li)
        for i in li1:
            if i == '..':
                if len(st) != 0:
                    st.pop()
                else:
                    continue
            elif i == '.':
                continue
            else:
                st.append(i)
        for i in st:
            if i == "":
                st.remove(i)
        print(st)
        res = '/'.join(st)
        res = '/' + res
        return res

    simplifyPath(simplifyPath, "/a//b////c/d//././/..")
