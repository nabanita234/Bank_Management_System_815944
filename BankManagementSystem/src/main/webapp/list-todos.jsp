<%@ include file="common/header.jspf"%>
<%@ include file="common/navigation.jspf"%>

<div class="container">

 <div>
  <a type="button" class="btn btn-primary btn-md" href="/add-todo">Add Account</a>
 </div>
 <br>
 <div class="panel panel-primary">
  <div class="panel-heading">
   <h3>List of Account's</h3>
  </div>
  <div class="panel-body">
   <table class="table table-striped">
    <thead>
     <tr>
      <th width="20%">Pan card</th>
      <th width="20%">IFSC code</th>
      <th width="20%">Target Date</th>
      <th width="20%">Account Type</th>
						<th width="20%">Account Number</th>
						<th width="20%">Send Money</th>
						
      <th width="20%"></th>
     </tr>
    </thead>
    <tbody>
     <c:forEach items="${todos}" var="todo">
      <tr>
       <td>${todo.panCard}</td>
        <td>${todo.IFSCcode}</td>
       <td><fmt:formatDate value="${todo.targetDate}"
         pattern="dd/MM/yyyy" /></td>
         	<td>${todo.accountType}</td>
							<td>${todo.accountNumber}</td>
							<td>${todo.sendMoney}</td>
       <td><a type="button" class="btn btn-success"
        href="/update-todo?id=${todo.id}">Update</a>
       <a type="button" class="btn btn-warning"
        href="/delete-todo?id=${todo.id}">Delete</a></td>
      </tr>
     </c:forEach>
    </tbody>
   </table>
  </div>
 </div>

</div>
<%@ include file="common/footer.jspf"%>