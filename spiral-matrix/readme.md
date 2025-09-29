<h2><a href="https://leetcode.com/problems/spiral-matrix/">54. Spiral Matrix</a></h2> <h3>Medium</h3> <hr> <p>Given an <code>m x n</code> matrix, return all elements of the matrix in <strong>spiral order</strong>.</p>

<p>Spiral order means traversing the matrix in a clockwise spiral: starting from the top-left corner, moving right across the first row, then down the last column, left across the last row, and up the first column—repeating this inward spiral until all elements are visited.</p>

<p>&nbsp;</p> <p><strong class="example">Example 1:</strong></p> <pre> <strong>Input:</strong> matrix = [[1,2,3],[4,5,6],[7,8,9]] <strong>Output:</strong> [1,2,3,6,9,8,7,4,5] </pre>

<p><strong class="example">Example 2:</strong></p> <pre> <strong>Input:</strong> matrix = [[1,2,3,4],[5,6,7,8],[9,10,11,12]] <strong>Output:</strong> [1,2,3,4,8,12,11,10,9,5,6,7] </pre>

<p>&nbsp;</p> <p><strong>Constraints:</strong></p> <ul> <li><code>m == matrix.length</code></li> <li><code>n == matrix[i].length</code></li> <li><code>1 &lt;= m, n &lt;= 10</code></li> <li><code>-100 &lt;= matrix[i][j] &lt;= 100</code></li> </ul>