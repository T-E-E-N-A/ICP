<h2><a href="https://leetcode.com/problems/max-consecutive-ones-iii/">1004. Max Consecutive Ones III</a></h2> <h3>Medium</h3> <hr> <p>Given a binary array <code>nums</code> and an integer <code>k</code>, return the maximum number of consecutive <code>1</code>'s in the array if you can flip at most <code>k</code> <code>0</code>'s.</p>

<p>This problem is best solved using a <strong>sliding window</strong> approach, where the window expands as long as the number of zeros inside it does not exceed <code>k</code>. When it does, the window shrinks from the left until the condition is restored.</p>

<p>&nbsp;</p> <p><strong class="example">Example 1:</strong></p> <pre> <strong>Input:</strong> nums = [1,1,1,0,0,0,1,1,1,1,0], k = 2 <strong>Output:</strong> 6 <strong>Explanation:</strong> Flip two zeros at indices 3 and 4 to get [1,1,1,1,1,1]. </pre>

<p><strong class="example">Example 2:</strong></p> <pre> <strong>Input:</strong> nums = [0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1], k = 3 <strong>Output:</strong> 10 <strong>Explanation:</strong> Flip three zeros to get the longest subarray of 1's. </pre>

<p>&nbsp;</p> <p><strong>Constraints:</strong></p> <ul> <li><code>1 &lt;= nums.length &lt;= 10<sup>5</sup></code></li> <li><code>nums[i]</code> is either <code>0</code> or <code>1</code></li> <li><code>0 &lt;= k &lt;= nums.length</code></li> </ul>