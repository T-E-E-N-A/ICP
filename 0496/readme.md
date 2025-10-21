<h2><a href="https://leetcode.com/problems/next-greater-element-i/description/">496. Next Greater Element I</a></h2> <h3>Easy</h3> <hr> <p>The next greater element of an element <code>x</code> in an array is the first greater element to the right of <code>x</code> in the same array.</p>

<p>You are given two distinct 0-indexed integer arrays <code>nums1</code> and <code>nums2</code>, where <code>nums1</code> is a subset of <code>nums2</code>.</p>

<p>For each element in <code>nums1</code>, find the next greater element in <code>nums2</code>. If it does not exist, return <code>-1</code>.</p>

<p>Return an array <code>ans</code> of length <code>nums1.length</code> such that <code>ans[i]</code> is the next greater element of <code>nums1[i]</code> in <code>nums2</code>.</p>

<p>&nbsp;</p> <p><strong class="example">Example 1:</strong></p> <pre> <strong>Input:</strong> nums1 = [4,1,2], nums2 = [1,3,4,2] <strong>Output:</strong> [-1,3,-1] </pre>

<p><strong class="example">Example 2:</strong></p> <pre> <strong>Input:</strong> nums1 = [2,4], nums2 = [1,2,3,4] <strong>Output:</strong> [3,-1] </pre>

<p>&nbsp;</p> <p><strong>Constraints:</strong></p> <ul> <li><code>1 ≤ nums1.length ≤ nums2.length ≤ 1000</code></li> <li><code>0 ≤ nums1[i], nums2[i] ≤ 10⁴</code></li> <li>All integers in <code>nums1</code> and <code>nums2</code> are unique.</li> <li><code>nums1</code> is a subset of <code>nums2</code>.</li> </ul>

<p><strong>Follow-up:</strong> Can you solve this in <code>O(nums1.length + nums2.length)</code> time?</p>