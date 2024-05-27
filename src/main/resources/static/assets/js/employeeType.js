$('document').ready(function(){
    $('.table #editEmployeeType').on('click',function(event){
        event.preventDefault();
        let href = $(this).attr('href')
        $.get(href,function (employeeType,status){
            $('#employeeTypeId').val(employeeType.employeeTypeId);
            $('#editDetails').val(employeeType.details);
            $('#editDescription').val(employeeType.description);

        })

        $('#editModal').modal();
    });

    $('.table #deleteEmployeeType').on('click',function (event){
        event.preventDefault();
        const href = $(this).attr('href')
        $('#confirmedDelete').attr('href',href);
        $('#deleteModal').modal();
    });
});