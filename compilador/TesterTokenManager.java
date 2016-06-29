/* Generated By:JavaCC: Do not edit this line. TesterTokenManager.java */
import java.io.*;
import java.util.ArrayList;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/** Token Manager. */
public class TesterTokenManager implements TesterConstants
{

  /** Debug output. */
  public static  java.io.PrintStream debugStream = System.out;
  /** Set debug output. */
  public static  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
private static final int jjStopStringLiteralDfa_0(int pos, long active0)
{
   switch (pos)
   {
      case 0:
         if ((active0 & 0x3ffffffeL) != 0L)
            return 6;
         if ((active0 & 0x10000000000000L) != 0L)
            return 2;
         return -1;
      case 1:
         if ((active0 & 0x1200L) != 0L)
            return 6;
         if ((active0 & 0x3fffedfeL) != 0L)
         {
            jjmatchedKind = 43;
            jjmatchedPos = 1;
            return 6;
         }
         return -1;
      case 2:
         if ((active0 & 0x28b80004L) != 0L)
            return 6;
         if ((active0 & 0x1747edfaL) != 0L)
         {
            if (jjmatchedPos != 2)
            {
               jjmatchedKind = 43;
               jjmatchedPos = 2;
            }
            return 6;
         }
         return -1;
      case 3:
         if ((active0 & 0x105c0L) != 0L)
            return 6;
         if ((active0 & 0x1fcee83eL) != 0L)
         {
            jjmatchedKind = 43;
            jjmatchedPos = 3;
            return 6;
         }
         return -1;
      case 4:
         if ((active0 & 0x1b0e602cL) != 0L)
         {
            jjmatchedKind = 43;
            jjmatchedPos = 4;
            return 6;
         }
         if ((active0 & 0x4c08812L) != 0L)
            return 6;
         return -1;
      case 5:
         if ((active0 & 0x90a202cL) != 0L)
         {
            if (jjmatchedPos != 5)
            {
               jjmatchedKind = 43;
               jjmatchedPos = 5;
            }
            return 6;
         }
         if ((active0 & 0x12044000L) != 0L)
            return 6;
         return -1;
      case 6:
         if ((active0 & 0x90a0024L) != 0L)
         {
            jjmatchedKind = 43;
            jjmatchedPos = 6;
            return 6;
         }
         if ((active0 & 0x10002008L) != 0L)
            return 6;
         return -1;
      case 7:
         if ((active0 & 0x10a0000L) != 0L)
         {
            jjmatchedKind = 43;
            jjmatchedPos = 7;
            return 6;
         }
         if ((active0 & 0x8000024L) != 0L)
            return 6;
         return -1;
      case 8:
         if ((active0 & 0x20000L) != 0L)
         {
            jjmatchedKind = 43;
            jjmatchedPos = 8;
            return 6;
         }
         if ((active0 & 0x1080000L) != 0L)
            return 6;
         return -1;
      default :
         return -1;
   }
}
private static final int jjStartNfa_0(int pos, long active0)
{
   return jjMoveNfa_0(jjStopStringLiteralDfa_0(pos, active0), pos + 1);
}
static private int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   return pos + 1;
}
static private int jjMoveStringLiteralDfa0_0()
{
   switch(curChar)
   {
      case 33:
         return jjStopAtPos(0, 37);
      case 38:
         return jjStopAtPos(0, 53);
      case 40:
         return jjStopAtPos(0, 47);
      case 41:
         return jjStopAtPos(0, 48);
      case 42:
         return jjStopAtPos(0, 32);
      case 43:
         return jjStopAtPos(0, 30);
      case 44:
         return jjStopAtPos(0, 46);
      case 45:
         jjmatchedKind = 31;
         return jjMoveStringLiteralDfa1_0(0x4000000000000000L);
      case 46:
         return jjStartNfaWithStates_0(0, 52, 2);
      case 47:
         return jjStopAtPos(0, 33);
      case 59:
         return jjStopAtPos(0, 45);
      case 60:
         jjmatchedKind = 35;
         return jjMoveStringLiteralDfa1_0(0x4000000000L);
      case 61:
         return jjStopAtPos(0, 34);
      case 62:
         jjmatchedKind = 36;
         return jjMoveStringLiteralDfa1_0(0x8000000000L);
      case 91:
         return jjStopAtPos(0, 49);
      case 92:
         return jjStopAtPos(0, 54);
      case 93:
         return jjStopAtPos(0, 50);
      case 65:
      case 97:
         return jjMoveStringLiteralDfa1_0(0x2L);
      case 66:
      case 98:
         return jjMoveStringLiteralDfa1_0(0x10L);
      case 67:
      case 99:
         return jjMoveStringLiteralDfa1_0(0x100L);
      case 68:
      case 100:
         return jjMoveStringLiteralDfa1_0(0x1000L);
      case 69:
      case 101:
         return jjMoveStringLiteralDfa1_0(0x8910004L);
      case 70:
      case 102:
         return jjMoveStringLiteralDfa1_0(0x20L);
      case 73:
      case 105:
         return jjMoveStringLiteralDfa1_0(0x2200L);
      case 80:
      case 112:
         return jjMoveStringLiteralDfa1_0(0x1020008L);
      case 82:
      case 114:
         return jjMoveStringLiteralDfa1_0(0x10044440L);
      case 83:
      case 115:
         return jjMoveStringLiteralDfa1_0(0x2200000L);
      case 84:
      case 116:
         return jjMoveStringLiteralDfa1_0(0x880L);
      case 85:
      case 117:
         return jjMoveStringLiteralDfa1_0(0x8000L);
      case 86:
      case 118:
         return jjMoveStringLiteralDfa1_0(0x20080000L);
      case 87:
      case 119:
         return jjMoveStringLiteralDfa1_0(0x4400000L);
      case 123:
         return jjStopAtPos(0, 59);
      case 126:
         return jjStopAtPos(0, 51);
      default :
         return jjMoveNfa_0(0, 0);
   }
}
static private int jjMoveStringLiteralDfa1_0(long active0)
{
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(0, active0);
      return 1;
   }
   switch(curChar)
   {
      case 45:
         if ((active0 & 0x4000000000000000L) != 0L)
            return jjStopAtPos(1, 62);
         break;
      case 61:
         if ((active0 & 0x4000000000L) != 0L)
            return jjStopAtPos(1, 38);
         else if ((active0 & 0x8000000000L) != 0L)
            return jjStopAtPos(1, 39);
         break;
      case 65:
      case 97:
         return jjMoveStringLiteralDfa2_0(active0, 0x200a0100L);
      case 69:
      case 101:
         return jjMoveStringLiteralDfa2_0(active0, 0x10244450L);
      case 70:
      case 102:
         if ((active0 & 0x200L) != 0L)
            return jjStartNfaWithStates_0(1, 9, 6);
         break;
      case 72:
      case 104:
         return jjMoveStringLiteralDfa2_0(active0, 0x400080L);
      case 76:
      case 108:
         return jjMoveStringLiteralDfa2_0(active0, 0x10000L);
      case 78:
      case 110:
         return jjMoveStringLiteralDfa2_0(active0, 0x890a004L);
      case 79:
      case 111:
         if ((active0 & 0x1000L) != 0L)
            return jjStartNfaWithStates_0(1, 12, 6);
         break;
      case 82:
      case 114:
         return jjMoveStringLiteralDfa2_0(active0, 0x500000aL);
      case 84:
      case 116:
         return jjMoveStringLiteralDfa2_0(active0, 0x2000000L);
      case 85:
      case 117:
         return jjMoveStringLiteralDfa2_0(active0, 0x20L);
      case 89:
      case 121:
         return jjMoveStringLiteralDfa2_0(active0, 0x800L);
      default :
         break;
   }
   return jjStartNfa_0(0, active0);
}
static private int jjMoveStringLiteralDfa2_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(0, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(1, active0);
      return 2;
   }
   switch(curChar)
   {
      case 65:
      case 97:
         return jjMoveStringLiteralDfa3_0(active0, 0x440L);
      case 67:
      case 99:
         return jjMoveStringLiteralDfa3_0(active0, 0x4000L);
      case 68:
      case 100:
         if ((active0 & 0x100000L) != 0L)
         {
            jjmatchedKind = 20;
            jjmatchedPos = 2;
         }
         return jjMoveStringLiteralDfa3_0(active0, 0x8800004L);
      case 69:
      case 101:
         return jjMoveStringLiteralDfa3_0(active0, 0x80L);
      case 71:
      case 103:
         return jjMoveStringLiteralDfa3_0(active0, 0x10L);
      case 73:
      case 105:
         return jjMoveStringLiteralDfa3_0(active0, 0x4400000L);
      case 76:
      case 108:
         return jjMoveStringLiteralDfa3_0(active0, 0x100L);
      case 78:
      case 110:
         return jjMoveStringLiteralDfa3_0(active0, 0x20L);
      case 79:
      case 111:
         return jjMoveStringLiteralDfa3_0(active0, 0x1000008L);
      case 80:
      case 112:
         return jjMoveStringLiteralDfa3_0(active0, 0x800L);
      case 82:
      case 114:
         if ((active0 & 0x20000000L) != 0L)
         {
            jjmatchedKind = 29;
            jjmatchedPos = 2;
         }
         return jjMoveStringLiteralDfa3_0(active0, 0x20a0002L);
      case 83:
      case 115:
         return jjMoveStringLiteralDfa3_0(active0, 0x10000L);
      case 84:
      case 116:
         if ((active0 & 0x200000L) != 0L)
            return jjStartNfaWithStates_0(2, 21, 6);
         return jjMoveStringLiteralDfa3_0(active0, 0x1004a000L);
      default :
         break;
   }
   return jjStartNfa_0(1, active0);
}
static private int jjMoveStringLiteralDfa3_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(1, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(2, active0);
      return 3;
   }
   switch(curChar)
   {
      case 65:
      case 97:
         return jjMoveStringLiteralDfa4_0(active0, 0x20002L);
      case 67:
      case 99:
         return jjMoveStringLiteralDfa4_0(active0, 0x1000020L);
      case 68:
      case 100:
         if ((active0 & 0x40L) != 0L)
            return jjStartNfaWithStates_0(3, 6, 6);
         break;
      case 69:
      case 101:
         if ((active0 & 0x10000L) != 0L)
            return jjStartNfaWithStates_0(3, 16, 6);
         return jjMoveStringLiteralDfa4_0(active0, 0x2800L);
      case 71:
      case 103:
         return jjMoveStringLiteralDfa4_0(active0, 0x8L);
      case 73:
      case 105:
         return jjMoveStringLiteralDfa4_0(active0, 0x2888010L);
      case 76:
      case 108:
         if ((active0 & 0x100L) != 0L)
            return jjStartNfaWithStates_0(3, 8, 6);
         else if ((active0 & 0x400L) != 0L)
            return jjStartNfaWithStates_0(3, 10, 6);
         return jjMoveStringLiteralDfa4_0(active0, 0x400000L);
      case 78:
      case 110:
         if ((active0 & 0x80L) != 0L)
            return jjStartNfaWithStates_0(3, 7, 6);
         break;
      case 79:
      case 111:
         return jjMoveStringLiteralDfa4_0(active0, 0x4000L);
      case 84:
      case 116:
         return jjMoveStringLiteralDfa4_0(active0, 0x4000000L);
      case 85:
      case 117:
         return jjMoveStringLiteralDfa4_0(active0, 0x18040000L);
      case 87:
      case 119:
         return jjMoveStringLiteralDfa4_0(active0, 0x4L);
      default :
         break;
   }
   return jjStartNfa_0(2, active0);
}
static private int jjMoveStringLiteralDfa4_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(2, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(3, active0);
      return 4;
   }
   switch(curChar)
   {
      case 65:
      case 97:
         return jjMoveStringLiteralDfa5_0(active0, 0x80000L);
      case 69:
      case 101:
         if ((active0 & 0x400000L) != 0L)
            return jjStartNfaWithStates_0(4, 22, 6);
         else if ((active0 & 0x4000000L) != 0L)
            return jjStartNfaWithStates_0(4, 26, 6);
         return jjMoveStringLiteralDfa5_0(active0, 0x1000000L);
      case 70:
      case 102:
         if ((active0 & 0x800000L) != 0L)
            return jjStartNfaWithStates_0(4, 23, 6);
         break;
      case 71:
      case 103:
         return jjMoveStringLiteralDfa5_0(active0, 0x2000L);
      case 72:
      case 104:
         return jjMoveStringLiteralDfa5_0(active0, 0x4L);
      case 76:
      case 108:
         if ((active0 & 0x8000L) != 0L)
            return jjStartNfaWithStates_0(4, 15, 6);
         break;
      case 77:
      case 109:
         return jjMoveStringLiteralDfa5_0(active0, 0x20000L);
      case 78:
      case 110:
         if ((active0 & 0x10L) != 0L)
            return jjStartNfaWithStates_0(4, 4, 6);
         return jjMoveStringLiteralDfa5_0(active0, 0xa000000L);
      case 82:
      case 114:
         return jjMoveStringLiteralDfa5_0(active0, 0x10044008L);
      case 83:
      case 115:
         if ((active0 & 0x800L) != 0L)
            return jjStartNfaWithStates_0(4, 11, 6);
         break;
      case 84:
      case 116:
         return jjMoveStringLiteralDfa5_0(active0, 0x20L);
      case 89:
      case 121:
         if ((active0 & 0x2L) != 0L)
            return jjStartNfaWithStates_0(4, 1, 6);
         break;
      default :
         break;
   }
   return jjStartNfa_0(3, active0);
}
static private int jjMoveStringLiteralDfa5_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(3, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(4, active0);
      return 5;
   }
   switch(curChar)
   {
      case 65:
      case 97:
         return jjMoveStringLiteralDfa6_0(active0, 0x8L);
      case 66:
      case 98:
         return jjMoveStringLiteralDfa6_0(active0, 0x80000L);
      case 68:
      case 100:
         if ((active0 & 0x4000L) != 0L)
            return jjStartNfaWithStates_0(5, 14, 6);
         return jjMoveStringLiteralDfa6_0(active0, 0x1000000L);
      case 69:
      case 101:
         return jjMoveStringLiteralDfa6_0(active0, 0x22000L);
      case 71:
      case 103:
         if ((active0 & 0x2000000L) != 0L)
            return jjStartNfaWithStates_0(5, 25, 6);
         break;
      case 73:
      case 105:
         return jjMoveStringLiteralDfa6_0(active0, 0x24L);
      case 78:
      case 110:
         if ((active0 & 0x40000L) != 0L)
         {
            jjmatchedKind = 18;
            jjmatchedPos = 5;
         }
         return jjMoveStringLiteralDfa6_0(active0, 0x10000000L);
      case 84:
      case 116:
         return jjMoveStringLiteralDfa6_0(active0, 0x8000000L);
      default :
         break;
   }
   return jjStartNfa_0(4, active0);
}
static private int jjMoveStringLiteralDfa6_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(4, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(5, active0);
      return 6;
   }
   switch(curChar)
   {
      case 73:
      case 105:
         return jjMoveStringLiteralDfa7_0(active0, 0x8000000L);
      case 76:
      case 108:
         return jjMoveStringLiteralDfa7_0(active0, 0x80004L);
      case 77:
      case 109:
         if ((active0 & 0x8L) != 0L)
            return jjStartNfaWithStates_0(6, 3, 6);
         break;
      case 79:
      case 111:
         return jjMoveStringLiteralDfa7_0(active0, 0x20L);
      case 82:
      case 114:
         if ((active0 & 0x2000L) != 0L)
            return jjStartNfaWithStates_0(6, 13, 6);
         break;
      case 83:
      case 115:
         if ((active0 & 0x10000000L) != 0L)
            return jjStartNfaWithStates_0(6, 28, 6);
         break;
      case 84:
      case 116:
         return jjMoveStringLiteralDfa7_0(active0, 0x20000L);
      case 85:
      case 117:
         return jjMoveStringLiteralDfa7_0(active0, 0x1000000L);
      default :
         break;
   }
   return jjStartNfa_0(5, active0);
}
static private int jjMoveStringLiteralDfa7_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(5, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(6, active0);
      return 7;
   }
   switch(curChar)
   {
      case 69:
      case 101:
         if ((active0 & 0x4L) != 0L)
            return jjStartNfaWithStates_0(7, 2, 6);
         return jjMoveStringLiteralDfa8_0(active0, 0xa0000L);
      case 76:
      case 108:
         if ((active0 & 0x8000000L) != 0L)
            return jjStartNfaWithStates_0(7, 27, 6);
         break;
      case 78:
      case 110:
         if ((active0 & 0x20L) != 0L)
            return jjStartNfaWithStates_0(7, 5, 6);
         break;
      case 82:
      case 114:
         return jjMoveStringLiteralDfa8_0(active0, 0x1000000L);
      default :
         break;
   }
   return jjStartNfa_0(6, active0);
}
static private int jjMoveStringLiteralDfa8_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(6, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(7, active0);
      return 8;
   }
   switch(curChar)
   {
      case 69:
      case 101:
         if ((active0 & 0x1000000L) != 0L)
            return jjStartNfaWithStates_0(8, 24, 6);
         break;
      case 82:
      case 114:
         return jjMoveStringLiteralDfa9_0(active0, 0x20000L);
      case 83:
      case 115:
         if ((active0 & 0x80000L) != 0L)
            return jjStartNfaWithStates_0(8, 19, 6);
         break;
      default :
         break;
   }
   return jjStartNfa_0(7, active0);
}
static private int jjMoveStringLiteralDfa9_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(7, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(8, active0);
      return 9;
   }
   switch(curChar)
   {
      case 83:
      case 115:
         if ((active0 & 0x20000L) != 0L)
            return jjStartNfaWithStates_0(9, 17, 6);
         break;
      default :
         break;
   }
   return jjStartNfa_0(8, active0);
}
static private int jjStartNfaWithStates_0(int pos, int kind, int state)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) { return pos + 1; }
   return jjMoveNfa_0(state, pos + 1);
}
static private int jjMoveNfa_0(int startState, int curPos)
{
   int startsAt = 0;
   jjnewStateCnt = 20;
   int i = 1;
   jjstateSet[0] = startState;
   int kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         do
         {
            switch(jjstateSet[--i])
            {
               case 0:
                  if ((0x3ff000000000000L & l) != 0L)
                  {
                     if (kind > 42)
                        kind = 42;
                  }
                  else if ((0x8400000000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 8;
                  else if (curChar == 46)
                     jjCheckNAddTwoStates(1, 2);
                  if ((0x3fe000000000000L & l) != 0L)
                     jjCheckNAddStates(0, 2);
                  else if (curChar == 48)
                  {
                     if (kind > 40)
                        kind = 40;
                     jjCheckNAddTwoStates(12, 15);
                  }
                  break;
               case 2:
                  if ((0x3fe000000000000L & l) != 0L)
                     jjCheckNAdd(3);
                  else if (curChar == 48)
                  {
                     if (kind > 41)
                        kind = 41;
                  }
                  break;
               case 1:
                  if (curChar == 48 && kind > 41)
                     kind = 41;
                  break;
               case 3:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 41)
                     kind = 41;
                  jjCheckNAdd(3);
                  break;
               case 4:
                  if ((0x3ff000000000000L & l) != 0L && kind > 42)
                     kind = 42;
                  break;
               case 6:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 43)
                     kind = 43;
                  jjstateSet[jjnewStateCnt++] = 6;
                  break;
               case 7:
                  if ((0x8400000000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 8;
                  break;
               case 8:
                  if ((0xffffef7a00000000L & l) != 0L)
                     jjCheckNAddTwoStates(9, 10);
                  break;
               case 9:
                  if ((0xffffef7b00000000L & l) != 0L)
                     jjCheckNAddTwoStates(9, 10);
                  break;
               case 10:
                  if ((0x8400000000L & l) != 0L && kind > 44)
                     kind = 44;
                  break;
               case 11:
                  if (curChar != 48)
                     break;
                  if (kind > 40)
                     kind = 40;
                  jjCheckNAddTwoStates(12, 15);
                  break;
               case 12:
                  if (curChar == 46)
                     jjCheckNAddTwoStates(1, 13);
                  break;
               case 13:
                  if ((0x3fe000000000000L & l) != 0L)
                     jjCheckNAdd(14);
                  break;
               case 14:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 41)
                     kind = 41;
                  jjCheckNAdd(14);
                  break;
               case 15:
                  if (curChar == 46 && kind > 41)
                     kind = 41;
                  break;
               case 16:
                  if ((0x3fe000000000000L & l) != 0L)
                     jjCheckNAddStates(0, 2);
                  break;
               case 17:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 40)
                     kind = 40;
                  jjCheckNAdd(17);
                  break;
               case 18:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 41)
                     kind = 41;
                  jjCheckNAddTwoStates(18, 12);
                  break;
               case 19:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(19, 15);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 0:
                  if ((0x7fffffe07fffffeL & l) != 0L)
                     jjCheckNAdd(6);
                  break;
               case 6:
                  if ((0x7fffffe87fffffeL & l) == 0L)
                     break;
                  if (kind > 43)
                     kind = 43;
                  jjCheckNAdd(6);
                  break;
               case 8:
               case 9:
                  if ((0x57ffffff07fffffeL & l) != 0L)
                     jjCheckNAddTwoStates(9, 10);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               default : break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 20 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
static private int jjMoveStringLiteralDfa0_2()
{
   switch(curChar)
   {
      case 10:
         return jjStopAtPos(0, 63);
      default :
         return 1;
   }
}
static private int jjMoveStringLiteralDfa0_1()
{
   switch(curChar)
   {
      case 125:
         return jjStopAtPos(0, 60);
      default :
         return 1;
   }
}
static final int[] jjnextStates = {
   17, 18, 19, 
};

/** Token literal values. */
public static final String[] jjstrLiteralImages = {
"", null, null, null, null, null, null, null, null, null, null, null, null, 
null, null, null, null, null, null, null, null, null, null, null, null, null, null, 
null, null, null, "\53", "\55", "\52", "\57", "\75", "\74", "\76", "\41", "\74\75", 
"\76\75", null, null, null, null, null, "\73", "\54", "\50", "\51", "\133", "\135", 
"\176", "\56", "\46", "\134", null, null, null, null, null, null, null, null, null, 
null, };

/** Lexer state names. */
public static final String[] lexStateNames = {
   "DEFAULT",
   "ComentarioBloco",
   "ComentarioLinha",
};

/** Lex State array. */
public static final int[] jjnewLexState = {
   -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
   -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
   -1, -1, -1, -1, -1, -1, -1, -1, -1, 1, 0, -1, 2, 0, -1, 
};
static final long[] jjtoToken = {
   0x7fffffffffffffL, 0x0L, 
};
static final long[] jjtoSkip = {
   0xdf80000000000000L, 0x0L, 
};
static final long[] jjtoMore = {
   0x2000000000000000L, 0x1L, 
};
static protected SimpleCharStream input_stream;
static private final int[] jjrounds = new int[20];
static private final int[] jjstateSet = new int[40];
private static final StringBuilder jjimage = new StringBuilder();
private static StringBuilder image = jjimage;
private static int jjimageLen;
private static int lengthOfMatch;
static protected char curChar;
/** Constructor. */
public TesterTokenManager(SimpleCharStream stream){
   if (input_stream != null)
      throw new TokenMgrError("ERROR: Second call to constructor of static lexer. You must use ReInit() to initialize the static variables.", TokenMgrError.STATIC_LEXER_ERROR);
   input_stream = stream;
}

/** Constructor. */
public TesterTokenManager(SimpleCharStream stream, int lexState){
   this(stream);
   SwitchTo(lexState);
}

/** Reinitialise parser. */
static public void ReInit(SimpleCharStream stream)
{
   jjmatchedPos = jjnewStateCnt = 0;
   curLexState = defaultLexState;
   input_stream = stream;
   ReInitRounds();
}
static private void ReInitRounds()
{
   int i;
   jjround = 0x80000001;
   for (i = 20; i-- > 0;)
      jjrounds[i] = 0x80000000;
}

/** Reinitialise parser. */
static public void ReInit(SimpleCharStream stream, int lexState)
{
   ReInit(stream);
   SwitchTo(lexState);
}

/** Switch to specified lex state. */
static public void SwitchTo(int lexState)
{
   if (lexState >= 3 || lexState < 0)
      throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
   else
      curLexState = lexState;
}

static protected Token jjFillToken()
{
   final Token t;
   final String curTokenImage;
   final int beginLine;
   final int endLine;
   final int beginColumn;
   final int endColumn;
   String im = jjstrLiteralImages[jjmatchedKind];
   curTokenImage = (im == null) ? input_stream.GetImage() : im;
   beginLine = input_stream.getBeginLine();
   beginColumn = input_stream.getBeginColumn();
   endLine = input_stream.getEndLine();
   endColumn = input_stream.getEndColumn();
   t = Token.newToken(jjmatchedKind, curTokenImage);

   t.beginLine = beginLine;
   t.endLine = endLine;
   t.beginColumn = beginColumn;
   t.endColumn = endColumn;

   return t;
}

static int curLexState = 0;
static int defaultLexState = 0;
static int jjnewStateCnt;
static int jjround;
static int jjmatchedPos;
static int jjmatchedKind;

/** Get the next Token. */
public static Token getNextToken() 
{
  Token matchedToken;
  int curPos = 0;

  EOFLoop :
  for (;;)
  {
   try
   {
      curChar = input_stream.BeginToken();
   }
   catch(java.io.IOException e)
   {
      jjmatchedKind = 0;
      matchedToken = jjFillToken();
      return matchedToken;
   }
   image = jjimage;
   image.setLength(0);
   jjimageLen = 0;

   for (;;)
   {
     switch(curLexState)
     {
       case 0:
         try { input_stream.backup(0);
            while (curChar <= 32 && (0x100002600L & (1L << curChar)) != 0L)
               curChar = input_stream.BeginToken();
         }
         catch (java.io.IOException e1) { continue EOFLoop; }
         jjmatchedKind = 0x7fffffff;
         jjmatchedPos = 0;
         curPos = jjMoveStringLiteralDfa0_0();
         break;
       case 1:
         jjmatchedKind = 0x7fffffff;
         jjmatchedPos = 0;
         curPos = jjMoveStringLiteralDfa0_1();
         if (jjmatchedPos == 0 && jjmatchedKind > 61)
         {
            jjmatchedKind = 61;
         }
         break;
       case 2:
         jjmatchedKind = 0x7fffffff;
         jjmatchedPos = 0;
         curPos = jjMoveStringLiteralDfa0_2();
         if (jjmatchedPos == 0 && jjmatchedKind > 64)
         {
            jjmatchedKind = 64;
         }
         break;
     }
     if (jjmatchedKind != 0x7fffffff)
     {
        if (jjmatchedPos + 1 < curPos)
           input_stream.backup(curPos - jjmatchedPos - 1);
        if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
        {
           matchedToken = jjFillToken();
           TokenLexicalActions(matchedToken);
       if (jjnewLexState[jjmatchedKind] != -1)
         curLexState = jjnewLexState[jjmatchedKind];
           return matchedToken;
        }
        else if ((jjtoSkip[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
        {
         if (jjnewLexState[jjmatchedKind] != -1)
           curLexState = jjnewLexState[jjmatchedKind];
           continue EOFLoop;
        }
        jjimageLen += jjmatchedPos + 1;
      if (jjnewLexState[jjmatchedKind] != -1)
        curLexState = jjnewLexState[jjmatchedKind];
        curPos = 0;
        jjmatchedKind = 0x7fffffff;
        try {
           curChar = input_stream.readChar();
           continue;
        }
        catch (java.io.IOException e1) { }
     }
     int error_line = input_stream.getEndLine();
     int error_column = input_stream.getEndColumn();
     String error_after = null;
     boolean EOFSeen = false;
     try { input_stream.readChar(); input_stream.backup(1); }
     catch (java.io.IOException e1) {
        EOFSeen = true;
        error_after = curPos <= 1 ? "" : input_stream.GetImage();
        if (curChar == '\n' || curChar == '\r') {
           error_line++;
           error_column = 0;
        }
        else
           error_column++;
     }
     if (!EOFSeen) {
        input_stream.backup(1);
        error_after = curPos <= 1 ? "" : input_stream.GetImage();
     }
     throw new TokenMgrError(EOFSeen, curLexState, error_line, error_column, error_after, curChar, TokenMgrError.LEXICAL_ERROR);
   }
  }
}

static void TokenLexicalActions(Token matchedToken)
{
   switch(jjmatchedKind)
   {
      case 40 :
        image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
                String t = image.toString();
                long n=Integer.parseInt(t);
                if(n < 0 || n > 2147483647)
                        System.out.println("Erro semantico na linha "+input_stream.getBeginLine()+", coluna "+input_stream.getBeginColumn()+".\u005cn\u005ctRango do Interiro excedido : Overflow .");
         break;
      case 41 :
        image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
                String[] strs = image.toString().split("\u005c\u005c.");
                if(strs[0].length() >9 || strs[1].length() > 9)
                        System.out.println("Erro semantico na linha "+input_stream.getBeginLine()+", coluna "+input_stream.getBeginColumn()+".\u005cn\u005ctLimite do numero de digitos excedido na parte entera ou real da variable.");
         break;
      case 43 :
        image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
                t = image.toString();
                if(t.length() > 16){
                        System.out.println("Erro semantico na linha "+input_stream.getBeginLine()+", coluna "+input_stream.getBeginColumn()+".\u005cn\u005ctTamanho maximo para identificador excedido.");
                }
         break;
      default :
         break;
   }
}
static private void jjCheckNAdd(int state)
{
   if (jjrounds[state] != jjround)
   {
      jjstateSet[jjnewStateCnt++] = state;
      jjrounds[state] = jjround;
   }
}
static private void jjAddStates(int start, int end)
{
   do {
      jjstateSet[jjnewStateCnt++] = jjnextStates[start];
   } while (start++ != end);
}
static private void jjCheckNAddTwoStates(int state1, int state2)
{
   jjCheckNAdd(state1);
   jjCheckNAdd(state2);
}

static private void jjCheckNAddStates(int start, int end)
{
   do {
      jjCheckNAdd(jjnextStates[start]);
   } while (start++ != end);
}

}
