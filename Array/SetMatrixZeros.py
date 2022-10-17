class SetMAtrixZeros(object):
    def setZeroes(self, matrix):
        """
        :type matrix: List[List[int]]
        :rtype: None Do not return anything, modify matrix in-place instead.
        """
        rows =[]
        cols = []

        for i in range(len(matrix)):
            for j in range(len(matrix[0])):
                if(matrix[i][j] == 0):
                    rows.append(j)
                    cols.append(i)

        for i in cols:
            for j in range(len(matrix[0])):
                matrix[i][j] = 0
        for i in rows:
            for j in range(len(matrix)):
                matrix[j][i] = 0
