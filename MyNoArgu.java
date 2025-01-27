package visitor;
import syntaxtree.*;
import java.util.*;

public class MyNoArgu extends GJNoArguDepthFirst<String> {
   Map<String, Map<String, Vector<String>>> ret;
   Map<String, Vector<String>> classstmts;
   Map<String,String> variables;
   Vector<String> stmts;
   String classname;
   String funcname;


   public MyNoArgu(Map<String, Map<String, Vector<String>>> _ret)
   {
      ret = _ret;
      classname = new String();
      funcname = new String();
   }

   public String visit(NodeToken n) { return n.tokenImage; }

   public String visit(Goal n) {
      n.f1.accept(this);
      return null;
   }

   public String visit(ClassDeclaration n) {
      classstmts = new HashMap<>();
      classname = n.f1.accept(this);
      n.f4.accept(this);
      ret.put(classname, classstmts);
      return null;
   }

   public String visit(ClassExtendsDeclaration n) {
      classstmts = new HashMap<>();
      classname = n.f1.accept(this);
      n.f6.accept(this);
      ret.put(classname, classstmts);
      return null;
   }

   public String visit(VarDeclaration n) {
      String type = n.f0.accept(this);
      String name = n.f1.accept(this);
      variables.put(name,type);
      return null;
   }

   public String visit(MethodDeclaration n) {
      funcname = n.f2.accept(this);
      variables = new HashMap<>();
      stmts = new Vector<>();
      n.f4.accept(this);
      n.f7.accept(this);
      n.f8.accept(this);
      classstmts.put(funcname, stmts);
      return null;
   }

   public String visit(FormalParameterList n) {
      n.f0.accept(this);
      n.f1.accept(this);
      return null;
   }

   public String visit(FormalParameter n) {
      String type = n.f0.accept(this);
      String name = n.f1.accept(this);
      variables.put(name,type);
      return null;
   }

   public String visit(FormalParameterRest n) {
      n.f1.accept(this);
      return null;
   }

   public String visit(Type n) {
      return n.f0.accept(this);
   }

   public String visit(BooleanType n) {
      return n.f0.accept(this);
   }

   public String visit(IntegerType n) {
      return n.f0.accept(this);
   }

   public String visit(VoidType n) {
      return n.f0.accept(this);
   }

   public String visit(Statement n) {
      n.f0.accept(this);
      return null;
   }

   public String visit(Block n) {
      n.f1.accept(this);
      return null;
   }

   public String visit(ReturnStatement n) {
      n.f1.accept(this);
      return null;
   }

   public String visit(AssignmentStatement n) {
      n.f2.accept(this);
      return null;
   }

   public String visit(FieldStoreStatement n) {
      String first  = n.f0.accept(this);
      String second = n.f2.accept(this);
      stmts.add(first);
      stmts.add(second);
      if(first=="this"){
         stmts.add(classname);
      }
      else{
         stmts.add(variables.get(first));
      }
      stmts.add(second);
      return null;
   }

   public String visit(MessageSendStatement n) {/////////////////////// COME HERE ////////////////////////////////
      // n.f0.accept(this);
      // n.f1.accept(this);
      // n.f2.accept(this);
      // n.f3.accept(this);
      // n.f4.accept(this);
      // n.f5.accept(this);
      // n.f6.accept(this);
      return null;
   }

   public String visit(IfStatement n) {
      n.f0.accept(this);
      return null;
   }

   public String visit(IfthenStatement n) {
      n.f4.accept(this);
      return null;
   }

   public String visit(IfthenElseStatement n) {
      n.f4.accept(this);
      n.f6.accept(this);
      return null;
   }

   public String visit(WhileStatement n) {
      n.f4.accept(this);
      return null;
   }

   public String visit(PrintStatement n) {
      n.f2.accept(this);
      return null;
   }

   public String visit(Expression n) {
      n.f0.accept(this);
      return null;
   }

   public String visit(AndExpression n) {
      n.f0.accept(this);
      n.f2.accept(this);
      return null;
   }

   public String visit(OrExpression n) {
      n.f0.accept(this);
      n.f2.accept(this);
      return null;
   }

   public String visit(CompareExpression n) {
      n.f0.accept(this);
      n.f2.accept(this);
      return null;
   }

   public String visit(NeqExpression n) {
      n.f0.accept(this);
      n.f2.accept(this);
      return null;
   }

   public String visit(PlusExpression n) {
      n.f0.accept(this);
      n.f2.accept(this);
      return null;
   }

   public String visit(MinusExpression n) {
      n.f0.accept(this);
      n.f2.accept(this);
      return null;
   }

   public String visit(TimesExpression n) {
      n.f0.accept(this);
      n.f2.accept(this);
      return null;
   }

   public String visit(DivExpression n) {
      n.f0.accept(this);
      n.f2.accept(this);
      return null;
   }

   public String visit(FieldLookup n) {
      String first  = n.f0.accept(this);
      String second = n.f2.accept(this);
      stmts.add(first);
      stmts.add(second);
      if(first=="this"){
         stmts.add(classname);
      }
      else{
         stmts.add(variables.get(first));
      }
      stmts.add(second);
      return null;
   }

   public String visit(MessageSend n) {/////////////////////// COME HERE ////////////////////////////////
      // n.f0.accept(this);
      // n.f1.accept(this);
      // n.f2.accept(this);
      // n.f3.accept(this);
      // n.f4.accept(this);
      // n.f5.accept(this);
      return null;
   }

   public String visit(ExpressionList n) {
      n.f0.accept(this);
      n.f1.accept(this);
      return null;
   }

   public String visit(ExpressionRest n) {
      n.f1.accept(this);
      return null;
   }

   public String visit(PrimaryExpression n) {
      n.f0.accept(this);
      return null;
   }

   public String visit(BaseExpression n) {
      return n.f0.accept(this);
   }

   public String visit(IntegerLiteral n) {
      n.f0.accept(this);
      return null;
   }

   public String visit(TrueLiteral n) {
      n.f0.accept(this);
      return null;
   }

   public String visit(FalseLiteral n) {
      n.f0.accept(this);
      return null;
   }

   public String visit(Identifier n) {
      return n.f0.accept(this);
   }

   public String visit(ThisExpression n) {
      return n.f0.accept(this);
   }

   public String visit(AllocationExpression n) {
      n.f1.accept(this);
      return null;
   }

   public String visit(NotExpression n) {
      n.f1.accept(this);
      return null;
   }

   public String visit(BracketExpression n) {
      n.f1.accept(this);
      return null;
   }
}