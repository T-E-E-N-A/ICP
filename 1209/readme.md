    <h2><a href="https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string-ii/description/">1209. Remove All Adjacent Duplicates in String II</a></h2> <h3>Medium</h3> <hr> <p>Given a string <code>s</code> and an integer <code>k</code>, perform <strong>k duplicate removals</strong> by repeatedly deleting <code>k</code> adjacent and equal characters from <code>s</code>. After each deletion, the left and right parts of the string concatenate. Continue this process until no more k duplicates can be removed.</p>

<p>Return the final string after all such operations. It is guaranteed that the answer is unique.</p>

<p>&nbsp;</p> <p><strong class="example">Example 1:</strong></p> <pre> <strong>Input:</strong> s = "abcd", k = 2 <strong>Output:</strong> "abcd" <strong>Explanation:</strong> No adjacent duplicates of length 2. </pre>

<p><strong class="example">Example 2:</strong></p> <pre> <strong>Input:</strong> s = "deeedbbcccbdaa", k = 3 <strong>Output:</strong> "aa" <strong>Explanation:</strong> Remove "eee" and "ccc" → "ddbbbdaa", then "bbb" → "dddaa", then "ddd" → "aa". </pre>

<p><strong class="example">Example 3:</strong></p> <pre> <strong>Input:</strong> s = "pbbcggttciiippooaais", k = 2 <strong>Output:</strong> "ps" </pre>

<p>&nbsp;</p> <p><strong>Constraints:</strong></p> <ul> <li><code>1 ≤ s.length ≤ 10⁵</code></li> <li><code>2 ≤ k ≤ 10⁴</code></li> <li><code>s</code> consists only of lowercase English letters.</li> </ul>