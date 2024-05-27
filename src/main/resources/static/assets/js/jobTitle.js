$('document').ready(function(){
    $('.table #editJobTitle').on('click',function(event){
        event.preventDefault();
        let href = $(this).attr('href')
        $.get(href,function (jobTitle,status){
            $('#jobTitleId').val(jobTitle.jobTitleId);
            $('#editDetails').val(jobTitle.details);
            $('#editDescription').val(jobTitle.description);
        })
        $('#editModal').modal();
    });
    $('.table #deleteVehicleType').on('click',function (event){
        event.preventDefault();
        const href = $(this).attr('href')
        $('#confirmedDelete').attr('href',href);
        $('#deleteModal').modal();
    });
});