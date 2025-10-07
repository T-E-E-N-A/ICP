<h2><a href="https://leetcode.com/problems/simplify-path/">71. Simplify Path</a></h2> <h3>Medium</h3> <hr> <p>Given an absolute path for a Unix-style file system, return the simplified canonical path.</p>

<p>The canonical path must follow these rules:</p> <ul> <li>It starts with a single slash <code>'/'</code>.</li> <li>Directories are separated by a single slash <code>'/'</code>.</li> <li>It does not end with a slash <code>'/'</code> unless it is the root directory.</li> <li>It does not contain <code>'.'</code> (current directory) or <code>'..'</code> (parent directory).</li> <li>Multiple consecutive slashes are treated as a single slash.</li> <li>Any sequence of periods not equal to <code>'.'</code> or <code>'..'</code> is treated as a valid directory name.</li> </ul>

<p>&nbsp;</p> <p><strong class="example">Example 1:</strong></p> <pre> <strong>Input:</strong> path = "/home/" <strong>Output:</strong> "/home" </pre>

<p><strong class="example">Example 2:</strong></p> <pre> <strong>Input:</strong> path = "/../" <strong>Output:</strong> "/" <strong>Explanation:</strong> Cannot go above root. </pre>

<p><strong class="example">Example 3:</strong></p> <pre> <strong>Input:</strong> path = "/home//foo/" <strong>Output:</strong> "/home/foo" </pre>

<p><strong class="example">Example 4:</strong></p> <pre> <strong>Input:</strong> path = "/.../a/../b/c/../d/./" <strong>Output:</strong> "/.../b/d" </pre>

<p>&nbsp;</p> <p><strong>Constraints:</strong></p> <ul> <li><code>1 ≤ path.length ≤ 3000</code></li> <li><code>path</code> consists of English letters, digits, period <code>'.'</code>, slash <code>'/'</code>, or underscore <code>'_'</code>.</li> <li><code>path</code> is a valid absolute Unix path.</li> </ul>