<h2><a href="https://leetcode.com/problems/decode-string/">394. Decode String</a></h2> <h3>Medium</h3> <hr> <p>Given an encoded string, return its decoded version.</p>

<p>The encoding rule is: <code>k[encoded_string]</code>, where the <code>encoded_string</code> inside the square brackets is repeated exactly <code>k</code> times.</p>

<p><strong>Note:</strong></p> <ul> <li><code>k</code> is a positive integer.</li> <li>The input string is guaranteed to be valid — no extra white spaces, well-formed brackets, and no digits outside of repeat counts.</li> <li>The original data does not contain digits — digits only appear as repeat counts.</li> </ul>

<p>&nbsp;</p> <p><strong class="example">Example 1:</strong></p> <pre> <strong>Input:</strong> s = "3[a]2[bc]" <strong>Output:</strong> "aaabcbc" </pre>

<p><strong class="example">Example 2:</strong></p> <pre> <strong>Input:</strong> s = "3[a2[c]]" <strong>Output:</strong> "accaccacc" </pre>

<p><strong class="example">Example 3:</strong></p> <pre> <strong>Input:</strong> s = "2[abc]3[cd]ef" <strong>Output:</strong> "abcabccdcdcdef" </pre>

<p>&nbsp;</p> <p><strong>Constraints:</strong></p> <ul> <li><code>1 ≤ s.length ≤ 30</code></li> <li><code>s</code> consists of lowercase English letters, digits, and square brackets <code>[]</code>.</li> <li>All integers in <code>s</code> are in the range <code>[1, 300]</code>.</li> </ul>