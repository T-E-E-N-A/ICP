<h2><a href="https://leetcode.com/problems/car-fleet/description/">853. Car Fleet</a></h2> <h3>Medium</h3> <hr> <p>There are <code>n</code> cars traveling toward a destination at mile <code>target</code>. Each car has a starting position and a speed. A car cannot pass another car, but it can catch up and travel alongside it at the slower car’s speed.</p>

<p>A <strong>car fleet</strong> is defined as a single car or a group of cars that meet and travel together at the same speed. If a car catches up to a fleet at the destination, it is still considered part of that fleet.</p>

<p>Return the number of car fleets that will arrive at the destination.</p>

<p>&nbsp;</p> <p><strong class="example">Example 1:</strong></p> <pre> <strong>Input:</strong> target = 12, position = [10,8,0,5,3], speed = [2,4,1,1,3] <strong>Output:</strong> 3 <strong>Explanation:</strong>

Cars at 10 and 8 meet at 12 → fleet 1

Cars at 5 and 3 meet at 6 → fleet 2

Car at 0 never catches up → fleet 3 </pre>

<p><strong class="example">Example 2:</strong></p> <pre> <strong>Input:</strong> target = 10, position = [3], speed = [3] <strong>Output:</strong> 1 </pre>

<p><strong class="example">Example 3:</strong></p> <pre> <strong>Input:</strong> target = 100, position = [0,2,4], speed = [4,2,1] <strong>Output:</strong> 1 </pre>

<p>&nbsp;</p> <p><strong>Constraints:</strong></p> <ul> <li><code>1 ≤ n ≤ 10⁵</code></li> <li><code>0 < target ≤ 10⁶</code></li> <li><code>0 ≤ position[i] < target</code></li> <li>All <code>position[i]</code> are unique.</li> <li><code>0 < speed[i] ≤ 10⁶</code></li> </ul>