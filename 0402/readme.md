<h2><a href="https://leetcode.com/problems/remove-k-digits/description/">402. Remove K Digits</a></h2> <h3>Medium</h3> <hr> <p>Given a string <code>num</code> representing a non-negative integer and an integer <code>k</code>, remove <code>k</code> digits from the number so that the new number is the smallest possible.</p>

<p>Note: The result should not contain leading zeros unless the result is <code>"0"</code>.</p>

<p>&nbsp;</p> <p><strong class="example">Example 1:</strong></p> <pre> <strong>Input:</strong> num = "1432219", k = 3 <strong>Output:</strong> "1219" <strong>Explanation:</strong> Remove digits 4, 3, and 2 to get the smallest number. </pre>

<p><strong class="example">Example 2:</strong></p> <pre> <strong>Input:</strong> num = "10200", k = 1 <strong>Output:</strong> "200" <strong>Explanation:</strong> Remove the leading 1. Result must not have leading zeros. </pre>

<p><strong class="example">Example 3:</strong></p> <pre> <strong>Input:</strong> num = "10", k = 2 <strong>Output:</strong> "0" <strong>Explanation:</strong> Removing all digits leaves nothing, so return "0". </pre>

<p>&nbsp;</p> <p><strong>Constraints:</strong></p> <ul> <li><code>1 ≤ k ≤ num.length ≤ 10⁵</code></li> <li><code>num</code> consists of only digits.</li> <li><code>num</code> does not have leading zeros except for the zero itself.</li> </ul>