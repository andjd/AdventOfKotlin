
fun main() {
    val input = data.split("\\s".toRegex())
            .map { it.toIntOrNull() }
            .filterNotNull()
    println(taskOne(input))
    println(taskTwo(input))
}

fun taskOne(data: List<Int>): Int = data.fold(0) { acc, module -> acc + fuelReq(module) }

fun taskTwo(data: List<Int>): Int = data.fold(0) { acc, module -> acc + recursiveFuelReq(module) }

fun fuelReq(module: Int): Int {
    var that = (module / 3 - 2) 
    return that
}

fun recursiveFuelReq(fuel: Int): Int {
    val new = fuelReq(fuel) 
    when (new > 0)  {
    true -> return new + recursiveFuelReq(new)
    else -> return 0 
    }
}
 
val testData = """
12
14
1969
100756
"""

val data = """130541
69856
104618
149406
64500
128553
94958
104788
87642
60597
142981
132940
64860
122199
131528
84879
144729
139907
147856
66258
95890
115399
106239
126841
59689
146878
105262
137079
145130
114767
94900
64349
105456
59491
79265
89321
62254
106996
107612
71451
138032
137610
52157
68712
134770
111493
50370
91088
149756
51638
110641
60113
54732
86907
73037
111831
116378
93493
55956
111018
99771
65224
149852
97464
148596
140102
81222
106843
61575
112180
124277
59315
101347
141260
90253
87946
55455
115978
51255
149617
77484
133499
128627
75777
135748
87630
86834
145664
86360
139511
60064
106100
123539
115732
107666
89177
82419
98712
148947
50931
"""