$('document').ready(function(){
    $('.table #editState').on('click',function(event){
        event.preventDefault();
        let href = $(this).attr('href')
        $.get(href,function (state,status){
            console.log(state);
            $('#editStateId').val(state.stateId);
            $('#editName').val(state.name);
            $('#editCapital').val(state.capital);
            $('#editCode').val(state.code);
            $('#editDetails').val(state.details);
            $('#editCountryId').val(state.countryid);
        })

        $('#editModal').modal();
    });

    $('.table #deleteState').on('click',function (event){
        event.preventDefault();
        const href = $(this).attr('href')
        $('#confirmedDelete').attr('href',href);
        $('#deleteModal').modal();
    });
});