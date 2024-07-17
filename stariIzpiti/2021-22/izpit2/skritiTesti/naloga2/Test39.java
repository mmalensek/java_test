
import java.util.*;

public class Test39 {

    private static final int[][][] SLIKA = {
        {{243,  47, 151}, {231, 131, 165}, { 54,   1, 206}, { 33, 105, 153}, {135, 161, 253}, {105, 121, 135}, { 99,  76, 121}, {234, 181,  37}, {227, 212,  91}, {124,  87, 141}, {122, 134, 176}, { 89, 191, 110}, {202, 131, 199}, { 20, 140, 140}, {145,  28,  46}, {  2, 174,  16}, {100,  67, 161}, {134,   6, 209}, {178,  14,  62}, {140, 100, 156}, {168, 130, 130}, {127,   3,   0}, { 53,   7,  16}, {163,  63, 201}, { 68, 234,   8}, { 30, 244, 176}, { 45,  13,  85}, { 47,  10, 239}, {130, 183,  14}, { 33, 120, 120}, { 60, 209, 107}, {138,   6, 202}, {173,  31, 100}, {  1,   8,  41}, { 20, 155,  27}, {108,  80,  25}, {  8,  50, 120}, {124,  10,  40}, {198,  10, 117}, {180, 131,  91}, {139, 211, 125}, { 13,  67,  81}, { 88,  92, 179}, { 90,  86,  58}, {106,  42, 247}, { 27, 186, 250}, {103,  67, 103}, { 37,  96,  33}, { 86,  63,  35}, {117, 202, 213}, {232,  76, 167}, { 62,  31, 121}, {161, 156, 253}, { 30,  86,  10}, { 26, 203, 164}, {139, 212, 130}, {125,  59, 242}, { 79,  14, 195}, {219, 217, 217}, {113, 233, 228}, {181,  36,  93}, {211, 246, 105}, { 74, 205, 248}, {  0, 155, 237}, { 17,  31,  54}, {135, 186,  74}, { 42,  66, 128}, { 85,  90, 165}, {184,  91, 145}, {163,  39, 210}, {200, 191,  34}, {177, 187, 244}, { 19, 186,  13}, {176, 246,  98}, {176, 143,  22}, { 36,  77, 228}, {235,  87, 136}, {146,  54,  98}, {  4,  41, 151}, { 30, 232,  84}, { 70, 232, 203}, { 47,  82,  76}, { 53, 172,  58}, {185, 208, 103}, { 36,  31, 176}, { 74, 161,  68}, {187, 185,  40}, { 39,  67, 168}, {141,  26, 140}, { 52,  65,  27}, {233,  45,   2}, {151, 103,  33}, { 95, 199, 157}, {203, 101, 162}, {179,  25,  96}, { 40, 212, 154}, {204, 221,  84}, { 72, 145,  20}, {141, 129,  30}, { 97, 193,  68}, { 13,  48,  73}, {242,  84, 233}, { 67,  66, 131}, {197, 125,  80}, {162,  56, 250}, {128, 248, 163}, {214, 252, 197}, {124,  66, 127}, {184,  51,  13}, {167,  18, 125}, {146, 118, 134}, { 69, 124, 239}, {  4,  44,  59}, { 98,  39,  10}, {106,  57,  93}, { 81,  57, 141}, {  8, 225,  22}, {255,  16, 182}, { 22, 154, 179}, { 46,   0,  98}, {166, 134, 242}, {130, 187,  49}, {146,  30, 246}, {167,   4, 246}, {191,  64,  26}, {  5, 242,  93}, { 56,  44,  99}, {129,  67,  20}, {246, 189, 163}, {179,  57,  19}, {141,  74, 161}, {105, 196,  31}, { 55, 134, 149}},
        {{104, 171, 150}, {250,   0, 244}, {202,  69,  99}, {230, 109, 179}, {183,  72, 141}, {139, 155, 173}, {154,  50,  18}, { 23, 103,   6}, {129, 155, 249}, {105,  95, 200}, { 54,   9, 220}, {194, 103,  79}, {127,  80, 163}, { 79, 213, 227}, {202,  59, 133}, {249,  86, 204}, {219, 194,  86}, {187, 128, 136}, { 22,  14,  27}, { 73,  59,  69}, { 50,  40, 191}, {  4, 104, 168}, {127,  13,  59}, { 54,  20, 125}, {137, 166,  10}, {227, 176, 139}, {144, 172, 114}, { 15,   5,  11}, {144, 215, 207}, {112,  25, 152}, { 51, 238, 203}, {111, 101, 216}, { 44,  64,  42}, { 18,   8, 153}, {174, 188, 191}, { 77,  34, 142}, {223, 200,  11}, {101, 156,  11}, { 10,  50,  54}, { 33,   3,  14}, { 88,  79, 166}, { 36,  57, 132}, {  8, 130, 153}, {138, 145, 120}, { 51, 109, 237}, {115, 170,  92}, {202, 130,  67}, {131,  35, 108}, { 40,  29, 212}, {  0,  26,  78}, { 55, 183,  14}, { 67,  51,  20}, { 68,  44, 219}, {150, 104, 128}, {133, 169, 195}, { 97, 110,  36}, {209,  43, 247}, {248, 169, 152}, { 26, 205,  32}, { 44,  98,   7}, { 84, 248, 224}, {201, 107, 105}, {215, 237, 232}, { 83,   5, 117}, {209,   2, 200}, { 62, 234, 127}, {144, 105,  93}, {  8,  65,  92}, { 28,  84, 129}, {147, 134, 156}, {226, 109, 153}, {141, 119, 125}, {201, 208, 147}, {145, 190,  64}, {124,  48,  78}, {230,  29, 177}, {121,  88, 175}, {220, 137,  20}, {  1, 193, 210}, {125, 183, 178}, {177, 106,  69}, {232,  66, 255}, { 39,  63, 114}, { 89, 155,  74}, { 50, 177, 105}, { 87,  87, 110}, { 44, 119, 164}, { 29,  24, 130}, {253, 125, 227}, {112,   3, 176}, {  2,   1,  38}, { 77,  33,  76}, { 13, 132, 149}, { 61, 219,  14}, {142,  10, 224}, {220, 224,  39}, {248, 158, 114}, { 16, 208, 143}, {137, 206,  92}, {202, 165,  98}, {229,  29,   7}, {157,  48, 113}, { 49, 174,  47}, {221, 243, 240}, { 55,  50, 127}, { 26,   4,  40}, {168, 252,  86}, {138, 175,  77}, {165,  96,  63}, { 85,  43,  23}, {190,  25,  25}, {118, 254,   0}, {114, 231, 122}, {167,  74,  20}, { 13,  84,  63}, {193, 115,  76}, { 18, 255,  87}, {  2,   9,  32}, {100,  17,  98}, {131, 202, 127}, {246, 237, 115}, { 30,   6, 218}, {  7, 198, 175}, {180,  58,  87}, {  0,  14,  63}, {222,  35,  86}, { 11,  54, 124}, {137, 206, 127}, { 30,  27,  20}, {170,  77, 233}, {147,  27,  17}, {  0, 163,  15}, { 93,  25, 118}},
        {{162, 220,   4}, {105,  13,  15}, { 72,  17,   8}, { 21, 109, 109}, { 55,  35,  30}, {190, 216, 230}, { 99,  40,  99}, {138, 100,  23}, {208,  88, 136}, {193,  59, 169}, {145, 247, 156}, {220, 169,  29}, {137, 126,  36}, {232, 108, 115}, {134,  13, 132}, {115,  79,  80}, {184, 120, 174}, {225,  45,  79}, {239, 224, 144}, {212,  17, 249}, {135, 186, 198}, { 69,   7, 178}, { 52,  30, 195}, { 19, 128, 125}, {170, 147,   5}, {190, 107,  47}, {179,  67,  13}, {143, 140, 187}, {195, 148, 199}, {143, 102, 137}, { 35,  70,  90}, {191, 190, 104}, {194, 188, 231}, {183, 112,  32}, {108, 249, 246}, { 34, 216, 158}, { 47,  20,  16}, {156, 144,  12}, {126,  19,  22}, {211, 118,  78}, { 34,  19, 103}, {188, 203,  58}, {254, 237,  77}, { 12,  69, 206}, { 53, 166,   9}, {108,  55,  27}, {110, 100, 126}, {254, 173, 182}, {219, 191,  52}, {161,  77, 177}, {176, 144, 244}, { 75,  29, 103}, {238,  83,  31}, { 29,  65, 145}, { 16, 143, 230}, { 95, 148,  71}, { 53,  47,  20}, {217, 100, 205}, {196,  25, 163}, { 28,  20, 125}, {159,  44,  12}, { 72,  72,  19}, {179,  70,  48}, {188,  89,  82}, {173,  71,  40}, { 43, 161,  18}, {102,  26,  16}, { 14,  30, 218}, { 53, 100, 191}, {177,  96,  73}, { 30, 121, 123}, {189,  79, 113}, {135, 112, 189}, {126,  71,   1}, {165, 113, 255}, {201, 204,  16}, {233, 233,   5}, {142, 189,  42}, {193, 150, 126}, {104,  79,   5}, { 41, 114, 175}, {219,  15, 184}, {136, 133,  19}, {168,  57,  50}, {115,  14, 127}, { 74, 197, 141}, {202,   4,  69}, {193,  62,  87}, { 14,  23,  56}, { 81,  98, 213}, {193, 128, 245}, {226,  13, 150}, {  3,  98,  41}, { 88, 239,  20}, { 31,  65, 195}, {144,  95, 124}, {132, 253, 181}, {111, 193, 214}, {174,  46, 215}, {137, 250, 245}, { 84,  12, 181}, {240, 152, 178}, { 94,  91,  54}, {147, 108, 185}, { 78,  93,  94}, {130, 211, 182}, { 17,   6,  35}, {233,  46, 173}, { 32,   5,  12}, { 86,  46, 157}, {198,   2,  66}, { 11,  51,  93}, {222,  73, 117}, { 63,  36, 139}, {240,  35,  16}, {214, 222,  16}, {184, 213, 245}, {177, 106, 126}, {240, 143, 161}, {166,  89,  84}, {175, 167, 149}, { 94, 152, 222}, { 83,  79,   8}, { 31,  82, 100}, {159, 240,  87}, {171,   7, 223}, {158, 147, 169}, { 50,  92, 103}, {177,  71, 157}, { 32,  95, 197}, {143,  11,  25}, {132, 161,  29}, {128, 156, 152}},
        {{ 79, 254,  27}, {208, 124,  66}, {144, 250, 196}, {216,  77, 160}, {152, 149,  47}, {133,  10, 123}, { 31, 111, 152}, { 26,  17,  83}, {223, 138,  73}, { 77, 205,  40}, {236,  35,  64}, {132, 225, 243}, { 56,  76,  77}, { 57,  51, 178}, {155, 170,  39}, {141, 190,  74}, {110,  37,  64}, { 36, 179, 200}, { 15,   1,  39}, { 51, 138, 236}, {165,  83, 135}, {135,  22, 166}, {105, 251,  60}, {236, 194, 246}, { 16,   9,  18}, {116,  86,  62}, {151, 251,  57}, { 60,  56,  87}, { 67,  52, 178}, {253,  31, 217}, { 94,  39,  78}, { 53, 178, 165}, { 31,  12,  77}, {191,  78, 194}, { 59, 164, 253}, {206, 222,  49}, {245, 197, 255}, {135,  51, 160}, {200, 237, 148}, {239, 196, 158}, {  4,  32,  98}, {149,  60, 114}, {230, 195,  22}, {155, 134, 134}, { 36, 185, 170}, {153,   7,  75}, { 86,  77, 138}, {118,  69, 180}, { 52, 163, 152}, { 91,   3,  49}, { 46,  81, 228}, {219, 242,  22}, {177,  36, 249}, { 74, 221, 198}, {146,  78, 193}, {117, 138,  42}, {153,  76, 186}, {153, 146, 254}, {248,  28,  86}, { 29, 207, 140}, { 42, 198, 166}, { 22, 166,  63}, {121, 162, 221}, { 78,  22,  79}, { 54,  87, 193}, {152, 243, 107}, { 74,  34, 217}, {151,  70, 105}, {235,  60, 251}, {154,  78,  63}, { 69,  74, 183}, {  5,   3,  83}, { 35, 208, 194}, {  4,  72,  91}, {148,  54, 158}, {124, 119, 171}, { 58, 104, 115}, { 66,  27, 164}, { 23, 243,  79}, {229,  38,  47}, {168,  21,  10}, {185, 253,  39}, {144,  98,  50}, {170, 188,  16}, {182, 179, 118}, { 60, 180, 160}, {119, 119,  93}, { 51, 249, 194}, {  3,  41, 160}, {241, 248,  47}, {111,  91,  76}, { 49, 223, 107}, {140, 169, 115}, {233, 217,  15}, {191,  47, 228}, {114, 136,  57}, {181,  66,  97}, { 70, 113,  22}, { 71,   5, 112}, { 49, 203, 153}, { 30,   8,   2}, {253,  45, 242}, {193,  86,  65}, {168,   4,  62}, {218,  74,  81}, {106, 108,  96}, {196, 156, 130}, {136, 118,  44}, {  3, 100, 114}, {222,  45,  14}, {218, 155,  45}, {191,  13, 100}, {115, 228,  96}, {173, 231, 207}, {159, 254,  42}, {183, 181, 226}, {  6, 119,  12}, {228,   0,  68}, { 11,   5,  23}, {119, 251,  76}, {219, 212,  99}, {157,   4, 239}, { 51, 115, 198}, { 61, 185,  54}, { 19,  63,  67}, { 46,  61,  86}, {189, 159,  91}, { 43,   7,  78}, {144, 145,  13}, {  6,  79, 117}, { 66, 233, 177}, {115,  70, 138}, {125,   6, 159}},
        {{ 93,  39, 231}, {223, 209, 178}, {127,  39,  97}, {242, 198, 183}, { 35,  74, 184}, { 75, 148,  88}, {106, 242, 169}, {114,  85,  49}, {245, 130, 200}, { 58,  80,  67}, {224, 106, 101}, {190, 249, 193}, { 51,  72, 108}, {127, 206, 141}, { 62, 106, 194}, {241,  79, 115}, { 88,  21,  42}, { 82,  55, 115}, { 91,  68,  13}, { 35,  21, 158}, {162, 252,  53}, { 53,  21,   5}, { 79,   5, 196}, { 40, 184,  19}, {156, 126,  70}, {167, 167, 205}, { 44, 186, 117}, { 54,   1,  58}, { 40,  40,  28}, { 49,  46,  72}, {119, 109,   0}, { 29, 212, 221}, {167,  56,  20}, {  3,  42, 141}, {226,  85,  96}, {139,  49,   7}, { 95,  71,  74}, { 52,  86, 142}, { 74, 187, 145}, { 30, 101, 177}, {157,  10,  75}, { 49, 107, 155}, { 43,  18,  34}, {205, 111, 129}, {205,  29, 133}, { 27, 169, 204}, {204,  80, 142}, {192, 155, 193}, { 49, 173, 229}, {254, 247,  71}, {176, 225, 112}, { 84,  92, 115}, {180, 132, 134}, { 22,  46, 210}, {140,  22,  51}, {117,  96, 224}, {198,  14,  90}, { 28,  22,  72}, {169,  34, 141}, { 54,  72, 211}, { 47, 150, 113}, {146,  64, 123}, { 31,   1,  10}, { 59, 102, 127}, { 28,   5,  21}, {194, 227, 236}, { 54, 105, 122}, {171,  49,  23}, {  5, 232,  16}, {155, 135,  65}, { 91,  59, 216}, { 67,  17, 214}, { 24,  93,  84}, {144,   2, 187}, { 59, 206, 205}, {150,  92,  18}, { 39, 131,  67}, { 21,   2,   3}, { 94,  62, 118}, { 64,  28,  61}, { 78,  43,  62}, { 18,  15,   0}, {178, 167, 172}, {179,  66, 171}, {189, 174,  81}, {136, 155,  16}, { 55, 190, 215}, { 10, 222,  45}, { 84,   5, 134}, {154,  35,   9}, { 19,  23,  75}, {168,  18, 213}, {183, 151,  46}, {  9, 209, 232}, { 40,  16,   4}, { 82,  37, 245}, { 71, 255,   3}, { 28, 242, 184}, { 33, 160,  37}, { 22, 196, 255}, {113, 155,  51}, { 11, 130, 159}, {167, 244, 171}, { 43, 137, 179}, {131, 255, 136}, {144,  94, 211}, { 32,  46,  17}, { 31,  71,  16}, {107,  84,  68}, {194,  70, 208}, {246,  99,  37}, {188, 132, 105}, {171, 168, 227}, {236,  14, 200}, {148, 250, 224}, { 46,  52, 237}, {148,   1, 235}, {161,  10, 155}, { 73,  50, 100}, {157, 239, 217}, {123,  44,  33}, { 67,  72, 178}, { 86, 235, 184}, { 16,  40,  56}, { 45,  99, 249}, {120,   1,  81}, {215,  91,  63}, { 20, 239,  98}, { 45,   1, 244}, {181, 191, 240}, { 61,  33,  90}, { 51, 231,  90}, { 56, 114,  19}},
        {{ 43,  88, 140}, { 30,  90, 200}, {177, 235,  66}, { 64,  21,  43}, { 96,  39,  61}, {189,  95, 133}, {115, 104,  63}, { 12,   5, 150}, { 66,  19, 119}, { 66, 225, 172}, {  7, 115, 129}, {123, 157,  55}, {218, 117,  57}, {  6, 163, 154}, {161, 199, 197}, { 82, 145,  63}, { 94,  92, 148}, { 89,  13,  96}, {179,  16,  55}, {251,  13, 178}, { 26, 250, 208}, {183,  87,  87}, {183, 179, 228}, { 13,  51,  64}, {127,  77, 138}, {202,  50, 182}, { 58, 121,   6}, { 75, 102,  36}, { 70, 252, 140}, {182,  90,  17}, {151,  10, 104}, { 37, 128, 238}, { 35,  66, 184}, {205, 197,  10}, {182, 181,  87}, {166,  58, 191}, {233, 122, 187}, {231, 241,  68}, { 46,  32,  78}, {104,   4,  40}, { 75, 122, 147}, {162, 180,   8}, { 98, 175, 191}, {121,  66, 115}, { 19, 147, 157}, { 52,  98,  24}, { 74,  14,  41}, { 76, 223,  20}, {243,  97,  97}, { 91,  99, 255}, { 49, 231, 188}, { 55, 160, 104}, { 67,  82, 110}, { 17, 207, 116}, { 18, 236,  23}, { 99,  87, 102}, { 16, 129, 187}, {188, 212,  73}, {177, 159,  27}, { 79,  62, 231}, {179,  39, 233}, {216, 130, 253}, {178, 201,  97}, { 38, 139, 156}, { 20, 125, 117}, {152,  36, 131}, {234, 186,  45}, {  9, 255, 100}, {137, 142, 225}, {  1, 195, 240}, {133, 126,  98}, {157, 161,  25}, {122,  40,  19}, {254, 122,  35}, {117,  82, 239}, {250, 227, 123}, {  7,   0,  52}, {174, 230,   5}, {116,  80, 151}, {119, 208,  57}, {118, 127,  95}, {152,  75, 188}, { 70, 172, 250}, {237, 100, 101}, {234,  10,  25}, {185,  89, 189}, {231,   3, 152}, {114,  87, 222}, {232, 170,  11}, {209, 162, 152}, {  3, 225, 251}, {124,  11,  32}, { 58,  84, 140}, { 14, 170, 217}, { 36,  70,  38}, {117,  37, 158}, {232, 188, 207}, {101, 195, 173}, {207, 172, 243}, { 18,  31,  77}, {168,  38,  53}, { 48,  16,  52}, { 56, 255,  51}, { 74, 127, 132}, { 95,  58, 183}, {153,   8,  25}, {106,  44,  83}, {142, 149, 216}, {187,   2,  44}, { 65,  40, 224}, { 48,  79, 100}, {207,  50, 136}, { 82,  24,  60}, {181, 186,  36}, { 31,  22,  17}, {  5, 234,  66}, { 66,   5,  57}, {237, 163, 108}, { 54, 231, 219}, {115,  26,  21}, {242, 148, 232}, {169,  13, 162}, { 88, 208,  67}, {103,  31,  16}, { 96, 114, 136}, { 87,  52,  25}, { 36,  29,  65}, {139, 199, 193}, {217, 115, 131}, { 20,  10, 196}, {152,  12, 251}, {244,  53,  45}, {124,  83, 155}},
        {{137,  99,  92}, {121,  40, 111}, { 85, 100, 131}, {217, 205, 200}, { 64,  56,  91}, { 25, 199, 199}, {153, 155,  60}, {205, 174,  98}, { 57, 212,  86}, {121,  83, 114}, { 10,  88,   5}, {231, 106,  99}, {127,   9,  38}, { 74,  23, 106}, { 17,  93, 201}, {187,  79,   4}, {215,  41,  79}, {161,  32, 159}, {172,   0, 135}, { 44,   6,   0}, { 17,  29,  82}, { 95,  63,   8}, { 73,  96, 101}, {234, 219, 169}, {162,  65, 132}, { 83, 179, 249}, {169, 194,  30}, {170, 146,  36}, { 59,  67,  16}, {225, 154,  58}, { 79, 234, 161}, {176, 243,  88}, {151, 111, 220}, {113,  41,  55}, {252, 106,  16}, {174,  73, 235}, { 14, 103, 157}, {169,  97, 139}, { 55,  19, 136}, {183, 136,  90}, {213,  71,  98}, { 22,   8,  72}, { 75,   2,  44}, {119, 185, 220}, { 19, 180,  31}, { 44, 197,  14}, {226, 223, 195}, { 35,  20, 111}, { 18, 170,   0}, {228, 187,  73}, {222,   5, 103}, {154,  25, 143}, {121, 112, 223}, {125, 147,  95}, { 11,  64, 168}, {239, 121,  40}, { 51,  62, 191}, {164, 224, 132}, {107, 115,   4}, { 86, 130, 184}, {196, 117, 201}, {229, 228,  36}, { 27,  11,  74}, {141,  66, 123}, { 54, 246, 130}, { 63, 246, 112}, {242, 215,  83}, {206,  12,   9}, {211, 127, 175}, { 53,  23,   7}, { 28, 130,  75}, {221, 119, 120}, {196, 136, 248}, {101, 109, 168}, { 29,  70, 169}, { 25,  98,  61}, {125, 105, 101}, {240, 193, 132}, { 43, 252,  56}, {163, 180, 136}, {  3,  22,  63}, {251, 100, 223}, { 96, 125, 136}, {104,  93,  26}, { 81, 180, 253}, {  9, 140,  27}, { 13,  48, 103}, {165,  48, 239}, {113, 201, 112}, {130,  72, 100}, {213,  52,  49}, {136, 122,  94}, {122, 165, 172}, { 77,  62, 147}, { 12, 120, 141}, { 31,  55, 126}, {214, 197, 105}, {106, 160, 237}, {  3,  66,  65}, { 62,  16,  30}, {  1,  19, 167}, {237,  67,  87}, {  0, 108, 129}, { 64, 150,  72}, {236,  15, 169}, { 87,  30, 105}, { 72, 151,  11}, { 58, 199, 112}, { 38,  94, 244}, {214,  21, 190}, { 65,   0, 232}, { 87, 146, 191}, {151, 178, 120}, { 77,  19, 137}, {242,  12,   8}, { 70, 171, 236}, { 62, 251, 180}, { 81, 168, 160}, { 39,  25,   7}, { 73, 161, 235}, {165, 242, 243}, { 31, 207, 114}, {110,  21, 230}, {243, 203,  45}, {243, 210, 169}, { 19,  30,  34}, {105, 136,  83}, { 79,  37,  16}, {132,  69,  21}, {132, 101, 133}, {134, 131,  18}, {170,  72, 210}, {  3, 151, 202}},
        {{145, 181, 199}, {167,  98,  94}, {125, 122, 137}, { 44,  13,  63}, { 63,  42, 127}, {127,  86, 151}, {199,  42,  75}, { 97,   9, 240}, {134,  23,  49}, {213,  25, 221}, {170, 142,  55}, {229,  10,  52}, {132,  75, 212}, { 55,  21,  26}, { 57, 104,   2}, {143, 136, 145}, {235, 145, 123}, { 64,  21,  28}, {216,  53, 163}, { 80,  71, 149}, {245, 195, 112}, {125, 116,  19}, { 30, 135,  80}, { 58,  88, 158}, {171,  27, 132}, {141,  71, 173}, {140, 192, 150}, {169,  29,  86}, {162, 238, 169}, {125, 255, 152}, {209, 161, 129}, {  7,   8,  35}, { 55,  76, 143}, {  5,  37, 105}, {180, 196, 134}, { 44, 169, 141}, {229, 134,  31}, { 81,  59, 231}, { 64,  95, 129}, {178,  54,  11}, {136, 108,  45}, {165,  27,  16}, { 79, 110, 161}, { 76,   3,  77}, { 30, 174, 209}, {192, 147,  49}, { 70,  48, 161}, { 52,  17,  51}, {207, 186,  83}, {101,  54,   6}, {184, 138,  12}, {165,  41, 196}, { 59, 135, 197}, {191,   0, 173}, { 43,   8, 124}, {214, 207,  34}, {178,  49, 152}, {200,  81,  31}, { 68,  49,  18}, {146,  16, 173}, {218,  95, 160}, { 86, 184, 210}, { 45, 220, 140}, { 27,   8,  20}, { 58,   1,   2}, { 91, 198, 194}, {186,   3, 192}, {216, 212, 248}, { 47,  48, 214}, { 10, 143, 229}, { 36,  79, 166}, {121,  95, 126}, {249, 206, 171}, { 50, 174, 126}, {136,   9, 204}, { 99, 163, 148}, { 88,  54, 165}, {  5, 225,  30}, {127, 156, 191}, { 81, 166, 249}, {101, 106,  71}, {246, 128, 160}, {198,  77, 252}, {105,  26,  45}, {115, 126,  54}, { 42, 129,  19}, { 29,  46, 107}, {162,  34, 139}, {122, 122,  40}, { 99, 149, 122}, { 48,   5, 212}, {221, 176, 247}, {  1, 230, 112}, {172, 221, 224}, {182, 199, 175}, { 13,  43,  69}, {244, 102,  60}, {136, 196,   1}, { 98, 198, 176}, {  5,  38,  94}, { 19,  42,  74}, {195,  67, 132}, {114, 152, 108}, {253,  95, 105}, {177,  19, 152}, { 33, 163, 137}, {139,  45, 104}, { 98,  72,   4}, {243,  69, 134}, { 97,   7,  73}, { 39,  15,  44}, { 49,   1,  89}, {147, 130,  63}, {146, 186,  13}, {162,  39, 220}, { 59, 160,  80}, {243, 134, 122}, {110,  18, 255}, {249, 106,  14}, { 58,  61, 137}, {124,   6, 164}, {149, 101, 151}, {221,  44, 163}, {201,  87,  86}, {213, 253,  73}, { 20,  67,  86}, { 48,  42,  17}, {244, 245,  96}, {218, 159,  77}, {194, 145, 184}, {149,   1,  67}, { 75,  62,  46}, {205,  21, 153}},
        {{ 51, 235, 177}, { 75, 181,   2}, {210, 172, 254}, { 17,  74, 108}, {206, 136, 238}, { 50,  74,  89}, {203, 231,  90}, {203,  87, 124}, {147,  48, 178}, { 41, 171, 161}, { 55, 215, 143}, { 93, 163,   2}, { 15,  87, 223}, { 56,  59, 200}, {119, 177,  90}, {162,  63,  67}, { 51, 115, 146}, { 71,  66,  60}, { 93, 141, 218}, {199,  58, 112}, {116, 127,  27}, {218,  37, 196}, {152,  18, 250}, {193, 149, 200}, { 96,  23,   0}, { 45, 242, 233}, { 74,  40, 119}, { 50,  18,  18}, { 65,  61,  85}, {129,  75, 146}, { 96, 139,  29}, { 46, 215, 162}, {  3, 134,  41}, {203, 118, 118}, { 41, 218,   4}, {245,  10, 192}, {109,  70, 121}, {199,  58,   4}, {129, 236,  56}, {220,  43, 214}, {237, 142, 117}, {193, 224, 235}, {251, 106, 137}, { 12,   0,  16}, { 77,  60, 161}, { 66,  47,  44}, {110,  73,  24}, { 94, 102,  32}, { 73, 181,  23}, {111, 161,   6}, {250, 201, 163}, { 11,  75,  80}, {140, 126,  16}, { 20,  53, 109}, {204,  52, 109}, { 77,  53, 218}, { 70,  60, 135}, {  3, 191, 175}, { 84, 212, 217}, { 30,  20,  33}, { 31, 141, 147}, { 81, 122, 228}, { 93,  13, 167}, { 84,  92,  96}, { 54,  61,  67}, { 70, 243, 254}, { 22, 194, 252}, { 14, 239, 191}, { 66, 129, 178}, {196,  24,  76}, {201, 191, 129}, {104, 177,  12}, {203, 149, 127}, {193,  26, 117}, {154,  68, 234}, {133, 189,  25}, {210,  21, 163}, {186, 206, 156}, {141, 136, 246}, {197, 166, 247}, {189, 131, 153}, {231,  58,  81}, { 45,  55, 191}, { 89, 213, 184}, { 40,  14, 188}, {140, 149, 149}, {121,  85, 169}, { 21, 218, 111}, { 62,  19,  88}, { 68, 132, 205}, {  5, 114,  46}, {227, 228,  25}, {208,  63, 247}, {  2,  14,  35}, {226,  13, 109}, {109,  54, 134}, { 20,  54,  33}, {150, 217,  77}, {156,  81, 104}, {165,  96,  46}, {184,  24,  19}, { 94, 107, 220}, { 93, 186, 110}, {159, 142, 178}, { 58,  35,  41}, {234, 210, 124}, {236, 170, 202}, {105,  42, 157}, {156, 139, 125}, {240, 182,  89}, { 78,   2, 177}, {123, 111, 145}, {241, 152, 167}, {164, 165, 116}, {166, 124, 155}, {  6, 164, 162}, { 59,   7, 237}, { 30,  27, 198}, { 99, 207, 178}, { 33,  32,  58}, {180,  51, 177}, { 86, 211,  33}, {175, 239,  39}, {128,  29, 252}, {244, 211, 126}, { 60,  22, 145}, { 95, 125, 140}, {242, 183,  93}, {195,  75, 191}, { 25, 239,  24}, {114, 242, 150}, {145, 200, 157}, {145,   3, 218}},
        {{124, 134, 211}, { 67,  48,  50}, {  4,  32,  90}, { 23,  12,   3}, { 28,  54, 104}, {248,  86,  45}, {155, 153,  18}, {208, 204, 150}, {118, 165, 157}, {212, 251, 248}, {244,  55, 162}, {156, 130,  16}, {225,   7, 135}, {163, 108,  20}, {209,  57,  83}, { 10,  19,  19}, {145,  82,  62}, {123,  30, 164}, {160,   9, 135}, {104, 208, 219}, { 45,  75, 129}, { 68, 175, 177}, {234, 148, 157}, { 79, 234,  27}, { 45,  24,  60}, { 43, 171,  27}, {235, 194, 181}, {229, 207, 203}, {205, 226, 232}, { 69, 144, 157}, { 93, 214, 177}, {172, 212,  31}, {152,  89,  81}, { 15,  76, 161}, {130, 121, 248}, {131, 162,  34}, {147,  88,  43}, { 55, 175,  17}, { 64,  85, 141}, {157, 112, 208}, {113,  47,  97}, { 52, 192,  53}, {199,  94, 170}, {182,   7, 187}, { 30, 180,  45}, {158, 219, 133}, {127,  57,  25}, {213,  92,  38}, { 51,  89,  75}, { 80,  32,  14}, {110,  40,  83}, { 16, 189, 198}, {180,  89,  71}, { 65,  72, 155}, { 79,  89, 131}, {118, 226, 164}, {205, 176, 119}, { 96, 145, 239}, {113, 149, 243}, { 31,  98, 124}, { 18, 150, 156}, {137,   7, 100}, {247,  90, 136}, { 61, 224,  35}, {  3,   4,  30}, { 50, 135, 179}, { 54,   9, 201}, {224, 244,  70}, {181,   5,  89}, { 16,   0,   7}, {204,  38,  56}, { 58, 115,  92}, {211,  88, 225}, {111,  53, 185}, {199, 152,  59}, {184, 237, 129}, {  3,  38,  49}, {233, 122,  99}, {113,  89,  48}, {  2,  64, 203}, {206,  82, 141}, {218, 224,  10}, {  5,  33,  96}, {171, 101,  65}, { 73, 233, 130}, {232, 108, 120}, { 77,  61, 149}, {135,  38, 170}, {198,  13,  33}, {245, 250,   4}, {  7,  75,  75}, {180, 251,  19}, { 59, 241, 186}, {126,  25,  76}, { 18,  85, 110}, {225, 199,  55}, {176,  28,  78}, {195, 243, 138}, {165,  23, 146}, {200, 249,  48}, { 51, 218,  25}, { 64,  10,  57}, {246,  79, 200}, { 35, 195,  51}, {249, 234,  89}, { 86,  24,  27}, {  9, 193,  33}, {216, 184, 206}, {130, 141, 155}, {  1, 163, 242}, {195,  51,  10}, {141,  98, 124}, { 17, 236, 191}, {160, 242,   6}, { 29, 204, 201}, { 16,   4,   1}, {214,  48,  67}, { 19,  82,  88}, { 57,  72, 225}, {172, 189,  49}, {204,  74, 217}, { 40, 185,  74}, {136, 141, 201}, {228, 180, 225}, {242, 181,  43}, {208, 206,   2}, { 93,   5, 167}, { 58,  27,  66}, {204, 183,  78}, {  8, 189,  11}, {129, 234,  73}, {169,  73, 237}, {166,  59, 185}},
        {{245, 141, 124}, { 43,  36,  44}, {242, 120,  47}, {217, 111, 243}, { 40,  62, 115}, {240,  50, 207}, {196,  82,  19}, { 17, 204, 224}, { 28,  44, 150}, {252,  84, 190}, {117, 162, 236}, { 28, 123, 180}, {201, 192,  61}, {108, 164,  85}, {102, 239, 149}, { 81,  18, 126}, { 59,  17,   9}, { 39,  55, 232}, {137,  98, 113}, {203,  12,  86}, { 35,  49,  55}, { 93,  67,  33}, {163, 162, 190}, { 40, 117, 139}, { 62, 253, 172}, {203,  15,  40}, {151,  15,  89}, {133,  60, 152}, {102, 124,  53}, {147, 114, 115}, { 96,  88, 141}, {176, 197,  89}, {219, 142, 142}, {150,   5,  68}, { 99, 133,  64}, {226, 112, 187}, {136,  18, 146}, {150, 164, 191}, {  2,  63,  70}, {  0, 129, 243}, {255,  51, 127}, {169, 246, 192}, { 45, 164, 227}, {142,  67,  15}, {185, 138,  58}, { 11, 170,  64}, {179,  69,  95}, {174,  94, 156}, { 63, 220,  36}, { 60, 216,  49}, { 22,  42,  18}, { 34,   0,   1}, {146,  15, 239}, { 47, 254,  96}, { 56, 105, 171}, { 86,  36, 221}, {216, 127, 192}, { 81, 102, 171}, {101, 170, 242}, { 22, 103,  81}, { 49, 118,  40}, {227,  38, 245}, {102,  92,  12}, {216, 234,  65}, { 85, 243, 171}, { 13, 105, 219}, {134, 127, 176}, {119, 137,  22}, {109,  83,  67}, {178,  83,  45}, { 52, 131, 155}, {226, 246, 221}, {214, 197, 128}, {176, 242,  38}, {133,  71, 201}, {113,  84, 114}, {  6,  18, 238}, {254,  40,  39}, {  8,  13,  43}, {  0,   8, 175}, {104,  79, 137}, { 36,  24,  44}, {  2,  46, 166}, {218, 121, 181}, {122,  51, 225}, {135,  13, 205}, {  1,   9,  10}, {251,  57,  60}, { 64,  12,   6}, {255,  54, 172}, {150, 162, 208}, {198,  43, 149}, {204,  43, 112}, {234,  64,  76}, {130, 187, 200}, { 33,  31,   6}, { 90, 163,  34}, { 19, 144,  58}, { 96,  86, 243}, { 74,  39, 115}, {178, 166, 218}, {156, 136, 185}, {  0,  85, 244}, {186, 249, 147}, {221, 103, 118}, { 47,   2,  10}, {111, 124,   0}, { 55,  50,  33}, {134,   8,  85}, { 78,  90, 126}, {244,  12, 187}, {109, 130, 166}, {169, 253, 183}, {104,  34, 234}, { 56,  87,  99}, {  6,   9,  90}, {184, 188,  61}, { 34,  64, 110}, {249,  88, 142}, {156,  75, 150}, {106, 120, 170}, { 38,  80, 112}, { 61,   7, 122}, {159,  56,  93}, { 90, 156, 135}, {136,  32, 146}, {109, 107, 132}, {163, 186, 107}, {192, 169, 107}, {217, 188, 221}, { 11, 178, 209}, { 51,  41, 191}, { 21,  29, 115}},
        {{ 87,  73,  12}, {193,  51,  35}, {167, 205, 212}, { 72, 114, 115}, {208,  78, 178}, { 38,  63, 108}, {181, 152, 227}, {245, 160, 210}, { 98, 125, 166}, { 66, 151, 244}, { 79, 172,  26}, { 97, 149, 253}, {224, 107,  42}, {  2, 167, 148}, { 11,  43,  20}, {222, 188, 122}, { 66,  22,  78}, {104,  75, 237}, {240, 134, 156}, {212,  73,  41}, {189, 137,  81}, { 78,  34,  14}, { 86,   7,  20}, {238,  23, 188}, {  3, 104,  90}, { 71,  68, 138}, {233, 196, 234}, {157,  40,  10}, {234,  16,  60}, {179, 255, 131}, {250, 102, 119}, { 32,  52, 140}, {137,   8,  96}, {203, 169, 122}, {104, 246,  77}, { 65,  52, 134}, {  2, 208, 213}, { 46, 235,  95}, { 63,  51,  91}, { 80,  49, 215}, { 81,  52, 237}, { 49,  39, 148}, {242, 212,  62}, {204, 155, 202}, { 93,  90, 174}, {103,  95, 122}, {171, 139, 205}, { 41,  11,   0}, { 75,   2,  18}, {147,  13, 111}, {151,  33, 199}, { 29,  77,  88}, {233,  58,  90}, {128, 138, 206}, {164, 138, 126}, {231,  50, 208}, {162,  94,  31}, { 72,   7, 220}, {235, 213,  19}, {132,   8,  72}, { 52,  25,  27}, { 14,  75,  59}, { 69,  67,  66}, {117, 131, 149}, { 72, 155, 227}, { 60,  41,  29}, {150, 182, 210}, {167, 107, 211}, { 95,  99, 138}, {222, 105, 128}, {124,   6,  45}, {131,  11, 220}, {186, 197,  18}, {248, 241, 170}, {109,  89,  85}, {101, 149,   3}, { 70, 177, 153}, { 91,  95, 190}, {127,  99, 189}, { 21, 246,  85}, {113, 178, 200}, {180,  15, 198}, {160, 171, 248}, {111, 173, 124}, { 80,   6,  27}, { 91, 131, 140}, {176, 197,  15}, {129, 185,  11}, { 43, 100, 147}, {  3,  11, 146}, {154,  27, 168}, { 66,   2,  12}, { 35,  94, 115}, {110,  67,   7}, {130,   2, 220}, { 26, 217,  84}, {214, 127, 105}, {173, 174, 128}, {108,  79,  58}, { 78, 160, 206}, {247,  73,  86}, {251,  69, 216}, {172, 146,   7}, {126,  27, 136}, { 34, 219, 117}, { 53,  46,  40}, {206, 156,  31}, {183,  48,  16}, {241, 115,  32}, {203, 182,  84}, {107,  88, 125}, {115, 254, 144}, {199,   2, 134}, {  5,   8, 123}, { 46,  57,  65}, {215,  10, 140}, {151,  96, 173}, {179,   7,  23}, {232, 186,  93}, { 56, 184,  45}, {120,  21,  15}, {212,  16, 126}, {132, 132,  96}, {156, 168, 123}, {167, 216,  97}, { 50,  29, 206}, { 91, 109, 215}, { 99, 127,  82}, {153,  33, 114}, { 74,  84,  34}, {216,  76,  88}, { 26,   3, 194}, {109,  40, 247}},
        {{255,  84, 135}, {110, 148, 132}, { 65, 235,  13}, {149, 192, 236}, {207, 108,  66}, {183,  94, 109}, { 50,  36, 164}, { 80,  36, 253}, {108,   6, 148}, { 96, 138, 184}, {140,  34, 149}, { 49, 180, 115}, { 65, 202, 208}, { 33, 183, 150}, {206, 141,  93}, { 52,  17, 113}, {  3,  27, 122}, {133,  56, 192}, {253, 184, 183}, {254, 101, 129}, {  8,  19,  29}, {124, 110, 133}, { 18, 101,  94}, {143,  91, 159}, { 97, 244, 200}, { 66,  65,  48}, { 67,  86, 157}, {118,  34, 105}, { 55,  73, 196}, { 47, 131,   9}, {222, 176, 111}, {207, 108,  58}, {254,  34, 251}, { 11, 100, 227}, { 45, 112, 158}, {223, 236, 227}, { 24,  40,  43}, { 19, 137, 145}, { 45,  77, 162}, {203, 217,  44}, { 84,  66, 235}, { 42,  37,  40}, {229, 122, 134}, {212,  16, 123}, {138, 149,  50}, {168, 117, 143}, { 33, 110, 122}, {198, 227,  72}, { 32,  14,  13}, {150, 215,  61}, {146,  83, 185}, {125, 100, 165}, {195, 230,  65}, { 22, 228, 173}, {218, 102, 131}, { 59,  10, 126}, { 66, 100, 126}, {226,  76, 156}, { 91, 255, 100}, { 96,  85, 147}, {  9,  55, 237}, {220, 239,  21}, {125, 158,  68}, { 32, 151, 158}, { 49,  41, 177}, {151, 149, 171}, {182,  48, 206}, { 87, 195, 113}, {223, 140, 134}, { 28,  58, 217}, { 58, 160, 227}, { 80,  64, 130}, { 51, 136, 241}, { 92, 177,  29}, {127, 157, 196}, { 55,  24,  62}, {249, 214, 233}, { 93, 241, 134}, { 54, 127,  22}, {209, 234,  55}, { 53, 246, 193}, {146, 169,  38}, { 77, 206,  97}, {136,  29, 121}, {239, 102, 220}, { 99,  94, 109}, {166, 146, 215}, { 34,  45,  47}, { 64,  24, 139}, {208, 136, 114}, { 89,  16,  14}, {207, 237, 116}, {220, 237,  63}, {120,  30,   1}, {189, 146,  79}, { 90,  16,  47}, { 11, 138,  61}, {115, 226,  46}, {108, 174, 172}, {237,  87, 184}, {254,  65, 119}, {142, 130, 107}, { 41, 240, 139}, {168,  44, 190}, {109,  67, 136}, {109, 143, 174}, {109, 105, 152}, {153, 102, 219}, {124, 120, 246}, {190, 199, 247}, { 56,  71,  91}, {176, 239, 187}, {205, 246, 104}, {158, 225,  58}, {104, 208,  68}, { 43,  85, 234}, { 88,  93, 166}, { 69, 123, 131}, { 59,   9,  90}, {255,  51,  35}, { 80,  61, 182}, { 98, 155,  25}, { 68, 137,  12}, {148, 243, 144}, {  8, 188,  19}, { 70,  50,  28}, { 17,  41, 122}, { 15,  33, 174}, {183, 130, 224}, {182, 123, 241}, {188,  29,  45}, {170, 217, 186}, {  6,  55,  82}},
    };

    public static void main(String[] args) {
        System.out.println(Druga.stolpecZNajvecPrevladujoceZelenimi(SLIKA));
    }
}
