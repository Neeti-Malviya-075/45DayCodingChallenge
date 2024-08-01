class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
    List<Integer> result = new ArrayList<>();
    if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
        return result;
    }

    int rows = matrix.length;
    int cols = matrix[0].length;
    int top = 0, down = rows - 1, left = 0, right = cols - 1;

    while (result.size() < rows * cols) {
        // Traverse top row
        for (int i = left; i <= right; i++) {
            result.add(matrix[top][i]);
        }
        top++;

        // Traverse right column
        for (int i = top; i <= down; i++) {
            result.add(matrix[i][right]);
        }
        right--;

        // Traverse bottom row
        if (top <= down) {
            for (int i = right; i >= left; i--) {
                result.add(matrix[down][i]);
            }
            down--;
        }

        // Traverse left column
        if (left <= right) {
            for (int i = down; i >= top; i--) {
                result.add(matrix[i][left]);
            }
            left++;
        }
    }

    return result;
    }
}