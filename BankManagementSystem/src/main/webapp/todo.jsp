<%@ include file="common/header.jspf"%>
<%@ include file="common/navigation.jspf"%>
<div class="container">
 <div class="row">
  <div class="col-md-6 col-md-offset-3 ">
   <div class="panel panel-primary">
    <div class="panel-heading">Add Account</div>
    <div class="panel-body">
     <form:form method="post" modelAttribute="todo">
      <form:hidden path="id" />
      <fieldset class="form-group">
       <form:label path="panCard">Pan Card</form:label>
       <form:input path="panCard" type="text" class="form-control"
        required="required" />
       <form:errors path="panCard" cssClass="text-warning" />
      </fieldset>
      
      <fieldset class="form-group">
       <form:label path="IFSCcode">IFSC code</form:label>
       <form:input path="IFSCcode" type="text" class="form-control"
        required="required" />
       <form:errors path="IFSCcode" cssClass="text-warning" />
      </fieldset>
      

      <fieldset class="form-group">
       <form:label path="targetDate">Target Date</form:label>
       <form:input path="targetDate" type="text" class="form-control"
        required="required" />
       <form:errors path="targetDate" cssClass="text-warning" />
      </fieldset>
      <fieldset class="form-group">
         <form:label path="accountType">Account Type</form:label>
							<form:select path="accountType">
							<form:option value="Savings" label="Savings"></form:option>
							<form:option value="Current" label="Current"></form:option>
							<form:option value="Salary" label="Salary"></form:option>
							</form:select>
							<form:errors path="accountType" cssClass="text-warning" />
						</fieldset>
						<fieldset class="form-group">
							<form:label path="accountNumber">Account Number</form:label>
							<form:input path="accountNumber" type="text" class="form-control"
								required="required" />
							<form:errors path="accountNumber" cssClass="text-warning" />
						</fieldset>
						<fieldset class="form-group">
							<form:label path="sendMoney">Send Money</form:label>
							<form:input path="sendMoney" type="text" class="form-control"
								required="required" />
								</fieldset>

      <button type="submit" class="btn btn-success">Save</button>
     </form:form>
    </div>
   </div>
  </div>
 </div>
</div>
<%@ include file="common/footer.jspf"%>